package com.example.listgridcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listgridcompose.ui.theme.ListGridComposeTheme

@Composable
fun CategoryScreen(modifier: Modifier = Modifier){

}

@Composable
@Preview(name = "Category Screen Preview", showBackground =  true, showSystemUi = true)
fun CategoryScreenPreview(){
    ListGridComposeTheme {
        CategoryScreen()
    }
}