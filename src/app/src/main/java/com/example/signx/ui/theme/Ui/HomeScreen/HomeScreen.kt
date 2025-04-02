////package com.example.signx.ui.theme.Ui.HomeScreen
////import android.os.Bundle
////import androidx.activity.ComponentActivity
////import androidx.activity.compose.setContent
////import androidx.compose.foundation.background
////import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.shape.CircleShape
////import androidx.compose.material3.*
////import androidx.compose.runtime.Composable
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.tooling.preview.Preview
////import androidx.compose.ui.unit.dp
////import androidx.compose.ui.unit.sp
////import androidx.compose.foundation.Image
////import androidx.compose.foundation.clickable
////import androidx.compose.ui.res.painterResource
////import androidx.compose.ui.text.font.FontWeight
////import androidx.compose.ui.draw.clip
////import androidx.compose.ui.layout.ContentScale
////import androidx.compose.ui.text.style.TextAlign
////
////class MainActivity : ComponentActivity() {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContent {
////            AdaptiveUI()
////        }
////    }
////}
////
////@Composable
////fun AdaptiveUI() {
////    Box(
////        modifier = Modifier
////            .fillMaxSize()
////            .background(Color(0xFFE6F0F2)),
////        contentAlignment = Alignment.Center
////    ) {
////        Column(
////            modifier = Modifier.fillMaxSize(),
////            horizontalAlignment = Alignment.CenterHorizontally,
////            verticalArrangement = Arrangement.SpaceBetween
////        ) {
////            Spacer(modifier = Modifier.height(20.dp))
////
////            Text(
////                text = "Tap to start talking",
////                fontSize = 18.sp,
////                fontWeight = FontWeight.Bold,
////                textAlign = TextAlign.Center,
////                color = Color.Black
////            )
////
////            Spacer(modifier = Modifier.weight(1f))
////
////            Row(
////                modifier = Modifier
////                    .fillMaxWidth()
////                    .padding(16.dp),
////                horizontalArrangement = Arrangement.SpaceEvenly
////            ) {
////                BottomNavItem(iconRes = android.R.drawable.ic_menu_myplaces)
////                BottomNavItem(iconRes = android.R.drawable.ic_menu_camera)
////
////                FloatingActionButton(
////                    onClick = { /* Handle Mic Click */ },
////                    modifier = Modifier.size(56.dp),
//////                    containerColor = Color(0xFF4EC5C1)
////                            containerColor = Color(0xFF3B6FA1)
////                ) {
////                    Icon(
////                        painter = painterResource(id = android.R.drawable.ic_btn_speak_now),
////                        contentDescription = "Microphone",
////                        tint = Color.White
////                    )
////                }
////
////                BottomNavItem(iconRes = android.R.drawable.ic_menu_manage)
////                BottomNavItem(iconRes = android.R.drawable.ic_menu_myplaces)
////            }
////        }
////    }
////}
////
////@Composable
////fun BottomNavItem(iconRes: Int) {
////    Icon(
////        painter = painterResource(id = iconRes),
////        contentDescription = null,
////        modifier = Modifier
////            .size(28.dp)
////            .clickable { }
////            .padding(4.dp),
////        tint = Color(0xFF4EC5C1)
////    )
////}
////
////@Preview(showBackground = true)
////@Composable
////fun PreviewAdaptiveUI() {
////    AdaptiveUI()
////}
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.wrapContentSize
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Mic
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MainScreen() {
//    val currentScreen = remember { mutableStateOf(Screen.Home) }
//
//    Scaffold(
//        containerColor = Color.Black,
//        bottomBar = {
//            BottomAppBar(
//                containerColor = Color.Black,
//                contentColor = Color.White
//            ) {
//                BottomNavigation(currentScreen.value) { screen ->
//                    currentScreen.value = screen
//                }
//            }
//        }
//    ) { innerPadding ->
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .background(Color.Black)
//        ) {
//            when (currentScreen.value) {
//                Screen.Home -> HomeScreenContent()
//                Screen.Profile -> ProfileScreen()
//                Screen.Settings -> SettingsScreen()
//            }
//        }
//    }
//}
//
//@Composable
//fun HomeScreenContent() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//    ) {
//        // Header section
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        ) {
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    text = "Home1",
//                    color = Color.White,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Medium
//                )
//
//
//            }
//        }
//
//        // Center voice control section
//        VoiceControlSection(
//            modifier = Modifier
//                .fillMaxSize()
//                .wrapContentSize(Alignment.Center)
//        )
//    }
//}
//
//@Composable
//fun VoiceControlSection(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier.clickable { /* Handle voice recording */ },
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Icon(
//            imageVector = Icons.Default.,
//            contentDescription = "Microphone",
//            tint = Color.White,
//            modifier = Modifier.size(48.dp)
//
////                    Text(
////                    text = "Tap to start talking",
////            color = Color.White,
////            fontSize = 24.sp,
////            fontWeight = FontWeight.Medium,
////            modifier = Modifier.padding(top = 16.dp)
//        )
//    }
//}
//
//@Composable
//fun BottomNavigation(currentScreen: Screen, onItemSelected: (Screen) -> Unit) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.Black)
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceAround
//    ) {
//        BottomNavItem(
//            icon = Icons.Default.Home,
//            isSelected = currentScreen == Screen.Home,
//            onClick = { onItemSelected(Screen.Home) }
//        )
//
//        BottomNavItem(
//            icon = Icons.Default.Person,
//            isSelected = currentScreen == Screen.Profile,
//            onClick = { onItemSelected(Screen.Profile) }
//        )
//
//        BottomNavItem(
//            icon = Icons.Default.Settings,
//            isSelected = currentScreen == Screen.Settings,
//            onClick = { onItemSelected(Screen.Settings) }
//        )
//    }
//}
//
//@Composable
//fun BottomNavItem(icon: Icons.Default, isSelected: Boolean, onClick: () -> Unit) {
//    val tint = if (isSelected) Color.White else Color.Gray
//
//    IconButton(onClick = onClick) {
//        Icon(
//            imageVector = icon,
//            contentDescription = null,
//            tint = tint,
//            modifier = Modifier.size(24.dp)
//        )
//    }
//}
//
//@Composable
//fun ProfileScreen() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Profile Screen",
//            color = Color.White,
//            fontSize = 24.sp
//        )
//    }
//}
//
//@Composable
//fun SettingsScreen() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(
//            text = "Settings Screen",
//            color = Color.White,
//            fontSize = 24.sp
//        )
//    }
//}
//
//enum class Screen {
//    Home, Profile, Settings
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun MainScreenPreview() {
//    MaterialTheme {
//        MainScreen()
//    }
//}