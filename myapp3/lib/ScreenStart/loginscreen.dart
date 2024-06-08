import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'home.dart';

class LoginScreen extends StatelessWidget {
  LoginScreen({super.key});

  Future<void> login(String username, String password, BuildContext context) async {
    var response = await http.post(
      Uri.parse('http://10.0.2.2:8000/token'),
      headers: {'Content-Type': 'application/x-www-form-urlencoded'},
      body: {'username': username, 'password': password},
    );

    if (response.statusCode == 200) {
      var data = jsonDecode(response.body);
      await Navigator.push(
        context,
        MaterialPageRoute(
            builder: (context) => HomeScreen(token: data['access_token'])),
      );
    } else {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(content: Text('Invalid username or password')),
      );
    }
  }

  final TextEditingController usernameController = TextEditingController();
  final TextEditingController passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      resizeToAvoidBottomInset: false,
      body: Container(
        padding: EdgeInsets.only(bottom: MediaQuery.of(context).viewInsets.bottom),
        decoration: const BoxDecoration(
          image: DecorationImage(
            image: AssetImage("assets/image/backgroud-1rst.png"),
            fit: BoxFit.cover,
          ),
        ),
        child: Center(
          child: Column(
            mainAxisSize: MainAxisSize.min, // Usar MainAxisSize.min aquí
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Image.asset(
                'assets/image/logoFinal.png',
                width: 150,
                height: 150,
              ),
              const SizedBox(height: 20),
              _buildTextField(usernameController, 'Usuario'),
              const SizedBox(height: 20),
              _buildTextField(
                  passwordController, 'Contraseña', isObscure: true),
              const SizedBox(height: 20),
              ElevatedButton(
                onPressed: () {
                  login(usernameController.text, passwordController.text,
                      context);
                },
                style: ElevatedButton.styleFrom(
                  backgroundColor: const Color(0xff110f26),
                  padding: const EdgeInsets.symmetric(
                      horizontal: 50, vertical: 15),
                ),
                child: const Text(
                  'Iniciar Sesión',
                  style: TextStyle(
                    color: Colors.white,
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildTextField(TextEditingController controller, String hintText,
      {bool isObscure = false}) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 20.0),
      child: TextField(
        controller: controller,
        obscureText: isObscure,
        decoration: InputDecoration(
          filled: true,
          fillColor: Colors.white.withAlpha(200),
          hintText: hintText,
          border: OutlineInputBorder(
            borderRadius: BorderRadius.circular(10),
            borderSide: BorderSide.none,
          ),
        ),
      ),
    );
  }
}
