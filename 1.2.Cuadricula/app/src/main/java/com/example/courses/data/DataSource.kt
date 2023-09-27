/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.Algoritmica, 58, R.drawable.architecture),
        Topic(R.string.Tesis, 121, R.drawable.crafts),
        Topic(R.string.Inteligencia_de_negocios, 78, R.drawable.business),
        Topic(R.string.Datamining, 118, R.drawable.culinary),
        Topic(R.string.Calculo_I, 423, R.drawable.design),
        Topic(R.string.Biologia, 92, R.drawable.fashion),
        Topic(R.string.Python, 165, R.drawable.film),
        Topic(R.string.Arte, 164, R.drawable.gaming),
        Topic(R.string.Musicas, 326, R.drawable.drawing),
        Topic(R.string.Redes, 305, R.drawable.lifestyle),
        Topic(R.string.Telecomunicaciones, 212, R.drawable.music),
        Topic(R.string.IA, 172, R.drawable.painting),
        Topic(R.string.Ingenieria, 321, R.drawable.photography),
        Topic(R.string.Cine, 118, R.drawable.tech)
    )
}
