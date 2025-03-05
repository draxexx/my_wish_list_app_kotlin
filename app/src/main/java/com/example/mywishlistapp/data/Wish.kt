package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String="",
    val description: String="",
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch 1"),
        Wish(title = "Google Watch 3", description = "An android Watch 2"),
        Wish(title = "Google Watch 4", description = "An android Watch 3"),
        Wish(title = "Google Watch 5", description = "An android Watch 4"),
    )
}