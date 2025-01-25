package com.rai.spotify.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rai.spotify.R
import com.rai.spotify.ui.theme.Black


data class CardItem(val imageRes: Int, val description: String)

@Composable
fun TelaDeAcesso() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Black)
    ) {
        Text(
            text = "Bom dia",
            color = Color.White,
            modifier = Modifier
                .padding(20.dp),
            fontSize = 24.sp
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically // Alinha o texto verticalmente ao centro
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.playlist1),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(90.dp)
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = "Top Brasil",
                            color = Black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold

                        )

                    }
                }
            }


            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.playlist2),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(90.dp)
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = "Top 2023 Sertanejo",
                            color = Black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically // Alinha o texto verticalmente ao centro
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.playlist3),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(90.dp)
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = "Melhores eletrônicas",
                            color = Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold

                        )

                    }
                }
            }


            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.playlist4),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(90.dp)
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = "Top 2023 Mundo",
                            color = Black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

        // Lista de imagens e descrições
        val cardItems = listOf(
            CardItem(R.drawable.rectangle5, "Gustavo Lima "),
            CardItem(R.drawable.rectangle4, "Hugo "),
            CardItem(R.drawable.rectangle3, "Guilherme "),
            CardItem(R.drawable.rectangle5, "Gustavo Lima "),
            CardItem(R.drawable.rectangle4, "Hugo "),
            CardItem(R.drawable.rectangle3, "Guilherme"),


        )

        Text(
            text = "Ouça Novamente",
            color = Color.White,
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )

        // Lista horizontal com LazyRow
        LazyRow(
            modifier = Modifier.
            fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaçamento entre itens
            ) {
            items(cardItems.size){ index -> // Exemplo com 10 itens
                val cardItem = cardItems[index]
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = cardItem.imageRes), // Substitua pelo ID correto
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp) // Tamanho da imagem
                            .clip(RoundedCornerShape(4.dp)) // Cantos arredondados na imagem
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = cardItem.description,
                        color = Color.White,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

        }
    }
}

@Preview
@Composable
fun visualizar() {
    TelaDeAcesso()
}