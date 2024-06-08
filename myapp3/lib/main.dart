import 'package:flutter/material.dart';
import 'package:myapp3/ScreenStart/home.dart';

import 'ScreenStart/loginscreen.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: LoginScreen(),
    );
  }
}



