package com.example.coderswag.services

import com.example.coderswag.models.Category
import com.example.coderswag.models.Product

object DataService {


    // listOf - Immutable
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Deveslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Deveslopes Hoodie Red", "$32", "hoodie2"),
        Product("Deveslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Deveslopes Black Hoodie", "$20", "hoodie4"),
        Product("Deveslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Deveslopes Hoodie Red", "$32", "hoodie2"),
        Product("Deveslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Deveslopes Black Hoodie", "$20", "hoodie4"),
    )

    val shirts = listOf(
        Product("Deveslopes Shirt Black", "$18", "shirt1"),
        Product("Deveslopes Badge Light Gray", "$20", "shirt2"),
        Product("Deveslopes Logo Shirt Red", "$19", "shirt3"),
        Product("Deveslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$28", "shirt5"),
        Product("Deveslopes Shirt Black", "$18", "shirt1"),
        Product("Deveslopes Badge Light Gray", "$20", "shirt2"),
        Product("Deveslopes Logo Shirt Red", "$19", "shirt3"),
        Product("Deveslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$28", "shirt5"),
    )

    val digitalGoods = listOf<Product>()


    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }




}