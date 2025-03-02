package com.example.myapplicationenejun.ui.InterfaceLiverpool


import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import java.time.format.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.myapplicationenejun.R


@Composable
fun InterfaceLiverpool(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()  // Hace que la columna ocupe toda la pantalla
            .verticalScroll(rememberScrollState())  // Habilita el desplazamiento vertical para el contenido

    ) {
        // 1. Top Bar
        CustomTopBar()

        // 2. Location Section
        LocationSection()

        // 3. Banner Promocional con el botón de ayuda en una Box para superponerlos
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            PromotionalBanner()
            HelpChatButton()
        }

        // 4. Sección de Productos
        FeaturedProductsSection()
        DiscountedProductsSection()
        // 5. Barra de Navegación
        CustomBottomNavigationBar()
    }
}

@Preview(showBackground = true)
@Composable
fun CustomTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color(0xFFEC2A89)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .padding(start = 16.dp)
        ) {
            SearchField()
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Search, contentDescription = "Carrito", tint = Color.Gray)
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxHeight()
                .padding(end = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {  }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Favoritos", tint = Color.White)
            }
            IconButton(onClick = { }) {
                Icon(Icons.Filled.ShoppingCart, contentDescription = "Carrito", tint = Color.White)
            }
        }
    }
}

@Composable
fun SearchField() {
    var searchText = TextFieldValue("")

    BasicTextField(
        value = searchText,
        onValueChange = { newText ->
            searchText = newText
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .background(Color.White)
            .padding(horizontal = 16.dp),
        singleLine = true
    )
}
@Preview(showBackground = true)
@Composable
fun LocationSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = "Ubicación",
                modifier = Modifier
                    .size(24.dp),
                tint = Color.Gray
            )
            Spacer(modifier = Modifier
                .width(8.dp))
            Text(
                text = "Selecciona tu tienda",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PromotionalBanner (){
    val image = painterResource(id = R.drawable.tenis)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(16.dp)
    ) {
        Image(
            painter = image,
            contentDescription = "Imagen destacada",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp)
        ) {
            Text(
                text = "TENIS CASUALES",
                style = androidx.compose.ui.text.TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            )
            Spacer(modifier = Modifier
                .height(2.dp))
            Text(
                text = "Comodidad y estilo en cada paso",
                style = androidx.compose.ui.text.TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FeaturedProductsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Lo mejor en carriolas para bebés",
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            )
            TextButton(
                onClick = { },
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = "Ver más",
                    style = androidx.compose.ui.text.TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color(0xFFEC2A89)
                    )
                )
            }
        }

        Spacer(modifier = Modifier
            .height(8.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5) { index ->
                val imageRes = when (index) {
                    0 -> R.drawable.c1
                    1 -> R.drawable.c2
                    2 -> R.drawable.c3
                    3 -> R.drawable.c4
                    else -> R.drawable.c5
                }
                ProductItem(
                    imageRes = imageRes,
                    title = "Carriola Modelo ${index + 1}"
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DiscountedProductsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Oferta en  Tecnología",
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            )
            TextButton(
                onClick = {  },
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = "Ver más",
                    style = androidx.compose.ui.text.TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color(0xFFEC2A89)
                    )
                )
            }
        }

        Spacer(modifier = Modifier
            .height(8.dp))

        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(5) { index ->
                val imageRes = when (index) {
                    0 -> R.drawable.t1
                    1 -> R.drawable.t2
                    2 -> R.drawable.t3
                    3 -> R.drawable.t4
                    else -> R.drawable.t5
                }
                ProductItem(imageRes, "Computadora Modelo ${index + 1}")
            }
        }

        Spacer(modifier = Modifier
            .height(8.dp))

    }
}
@Composable
fun ProductItem(imageRes: Int, title: String) {
    Column(
        modifier = Modifier
            .width(100.dp)
            .padding(4.dp)
            .background(Color.White, shape = MaterialTheme.shapes.medium)
            .padding(4.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier
            .height(4.dp))
        Text(
            text = title,
            style = androidx.compose.ui.text.TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        )
    }
}
@Preview(showBackground = true)
@Composable
fun CustomBottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val items = listOf(
            Triple("Inicio", Icons.Filled.Home, Color(0xFFEC2A89)),
            Triple("Categorías", Icons.Filled.Search, Color.Gray),
            Triple("Crédito y Ahorro", Icons.Filled.MoreVert, Color.Gray),
            Triple("Servicios", Icons.Filled.Build, Color.Gray),
            Triple("Mi cuenta", Icons.Filled.AccountCircle, Color.Gray)
        )

        items.forEach { (label, icon, color) ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable() { }
                    .padding(4.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = label,
                        modifier = Modifier.size(24.dp),
                        tint = color
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = label,
                        style = androidx.compose.ui.text.TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = color
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}
//Parte nueva implementadada, botón flotante de ayuda
@Preview(showBackground = true)
@Composable
fun HelpChatButton() {
    Box(Modifier.fillMaxSize()) {
        FloatingActionButton(
            onClick = {},
            containerColor = Color(0xFFEC2A89),
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd)
        ) {
            Icon(Icons.Filled.Call, contentDescription = "Chat de ayuda", tint = Color.White)
        }
    }
}