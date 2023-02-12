package com.example.a334zyrianov

data class content(val imId:Int, val text_content:String, val text_content2: String)
class content_all{val list_cont = arrayListOf(content(R.drawable.blackclover, "Черный клевер", "160 серия"),
content(R.drawable.dororo, "Дороро", "20 серия"),
    content(R.drawable.fullmetalalchemist, "Стальной алхимик", "30 серия"),
    content(R.drawable.goldenboyjpeg, "Золотой парень", "5 серия"),
    content(R.drawable.samuraichamploo, "Самурай Чамплу", "23 серия"),
    content(R.drawable.toureternity, "Для тебя, Бессмерный", "15 серия"))}
