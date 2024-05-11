package com.example.tu_barrio_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tu_barrio_login.ui.theme.TU_BARRIO_LOGINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TU_BARRIO_LOGINTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}
class Group1 extends StatelessWidget {
    @override
    Widget build(BuildContext context) {
        return Column(
                children: [
                Container(
                        width: 718,
        height: 1288,
        child: Stack(
        children: [
        Positioned(
                left: 79,
        top: 570.45,
        child: Text(
        'Sign In',
        style: TextStyle(
        color: Color(0xFF1E1E1E),
        fontSize: 40,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w700,
        height: 0.04,
        letterSpacing: -0.88,
        ),
        ),
        ),
        Positioned(
                left: 79,
        top: 647,
        child: Text(
        'Email',
        style: TextStyle(
        color: Color(0xFF1E1E1E),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 97,
        top: 698.27,
        child: Text(
        '******',
        style: TextStyle(
        color: Color(0xFF1E1E1E),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 97,
        top: 839.27,
        child: Text(
        '******',
        style: TextStyle(
        color: Color(0xFF1E1E1E),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 79,
        top: 787.09,
        child: Text(
        'Password',
        style: TextStyle(
        color: Color(0xFF1E1E1E),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 79,
        top: 1028.27,
        child: Text(
        'Forgot password',
        style: TextStyle(
        color: Color(0xFF757575),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 538,
        top: 1028.27,
        child: Text(
        'Sign up',
        style: TextStyle(
        color: Color(0xFF0D99FF),
        fontSize: 24,
        fontFamily: 'Inter',
        fontWeight: FontWeight.w500,
        height: 0.06,
        letterSpacing: -0.46,
        ),
        ),
        ),
        Positioned(
                left: 207,
        top: 185,
        child: Container(
        width: 295,
        height: 295,
        decoration: ShapeDecoration(
        image: DecorationImage(
        image: NetworkImage("https://via.placeholder.com/295x295"),
        fit: BoxFit.cover,
        ),
        shape: RoundedRectangleBorder(
        side: BorderSide(
        width: 8,
        strokeAlign: BorderSide.strokeAlignOutside,
        color: Colors.white,
        ),
        borderRadius: BorderRadius.circular(4),
        ),
        shadows: [
        BoxShadow(
                color: Color(0x19000000),
                blurRadius: 6,
        offset: Offset(0, 2),
        spreadRadius: 0,
        )BoxShadow(
            color: Color(0x14000000),
            blurRadius: 2,
        offset: Offset(0, 0),
        spreadRadius: 0,
        )BoxShadow(
            color: Color(0x33000000),
            blurRadius: 0,
        offset: Offset(0, 0),
        spreadRadius: 1,
        )
        ],
        ),
        ),
        ),
        ],
        ),
        ),
        ],
        );
    }
}