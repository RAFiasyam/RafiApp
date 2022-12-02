package com.rafi.rafiapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Item(val image: Int, val text: String, val detail: String): Parcelable {

    companion object {
        val items = listOf<Item>(
            Item(
                image = R.drawable.laptopapple,
                text = "MacBook Pro",
                detail = "Siapa yang tak kenal dengan produk mewah yang satu ini. Laptop brand Apple ini hadir dengan Sistem Operasi bawaan brand itu sendiri yaitu MacOS. Tahukah Anda? Brand ini diakui bahkan sampai seluruh dunia yaitu merk laptop termahal. Penasaran mengapa produk merk ini dibandrol dengan harga yang mahal? Jadi, setiap produk laptop keluaran apple ini didesain dengan sangat mewah dari material premium. Selain itu perangkatnya juga memiliki prosesor yang sangat kuat. \n\nJika biasanya suatu laptop digunanakan hingga 3 tahun, kecepatan dari laptop tersebut akan berkurang seiring banyaknya data yang telah ditampung pada laptop tersebut. Dan itu tidaklah berlaku untuk produk Apple. Selain itu produk ini juga dibekali dengan baterai yang awet dan mumpuni. Tak ketinggalan, apple memiliki ciri khas dimana layar retina pada laptop ini tak pernah tertandingi dari merk laptop terbaik lainnya. "
            ),//1
            Item(
                image = R.drawable.laptopdell,
                text = "Laptop Dell XPS ",
                detail = "Memiliki bodi yang sangat kuat dengan inovasi-inovasi terdepan, itulah keunggulan dari laptop merk Dell. Merk ini memiliki fokus yang sangat tinggi pada kualitas laptop yang dihadirkan. Tidak melulu harus launching setiap tahun, Dell justru mengelurkan update produknya berdasarkan inovasi-inovasi terbaru yang dihadirkan dari produk tersebut. \n\nTak hanya di Indonesia saja, produk keluaran merk laptop terbaik ini juga diakui sampai ke dunia dan sudah mendapatkan tempat di pasar dunia. Laptop ini selalu hadir memenuhi kebutuhan-kebutuhan dengan kualitas dan harga yang seimbang dengan fitur-fitur yang ditawarkan. Salah satu fitur yang juga membuat produk ini diakui dan disukai adalah daya tahan baterai untuk setiap laptop sangatlah awet. "
            ),//2
            Item(
                image = R.drawable.laptoplenovo,
                text = "Laptop Lenovo Thinkpad ",
                detail = "Tidak harus mewah yang penting bisa membantu pekerjaan, itulah yang membawa merk ini diakui dan disukai. Terlebih untuk masyarakat Indonesia, ini adalah merk laptop terbaik yang sangat disukai. Mengapa demikian? Merk ini hadir membawa laptop dengan segmen harga yang sangat berjenis. Jadi, siapa pun bisa medapatkan laptop merk lenovo walaupun budget yang sediakan tidak terlalu banyak. \n\nJika Anda ingin laptop seharga puluhan juta, merk ini hadir membawa Anda dengan produk laptop harga puluhan juta. Jika Anda ingin laptop dibawah 5 juta saja, Lenovo juga memiliki produk sesuai dengan budget tersebut. Hal ini adalah salah satu mengapa merk ini diakui di pasar elektronik. Tak ketinggalan juga, produk laptop lenono juga diakui dengan keawetannya dan durabilitasnya yang tinggi."
            ),//3
            Item(
                image = R.drawable.laptopasus,
                text = "Laptop Asus ",
                detail = "Memiliki penawaran harga yang baik, itulah yang membawa merk laptop terbaik ini menjadi salah satu merk laptop terbaik 2022. Asus diakui mampu menjangkau banyak kalangan sehingga produk ini semakin dikenal di pasar elektronik. \n\nSelain itu, salah satu produk Asus yang sangat mendunia sehingga membawa merk ini dilirik oleh pasar elektronik adalah laptop seri ROG untuk gaming. Ini adalah salah satu produk Andalan dari merk ini. Dengan spesifikasi yang tinggi termasuk RAM dan prosesor yang mumpuni, Lapto Asus seri ROG ini bisa membawa para gamer ke dunia gaming yang sempurna.\n"
            ),//4
            Item(
                image = R.drawable.laptopmsi,
                text = "Laptop Asus ",
                detail = "Jika disebut merk MSI, apa yang ada dibenak Anda? Game? Anda benar. Merk laptop MSI ini dikenal dan meroket dari para gamer-gamer dunia. Laptop ini hadir dengan spesifikasi yang sangat tinggi seperti spesifikasi RAM minimal 8 GB yang mampu memuaskan para gamer. Terlebih lagi saat ini game sangatlah marak, merk laptop ini pun semakin dikenal dan menjadi salah satu laptop game terbaik dunia. \n\nBisa digunakan untuk pekerjaan sehari-hari, namun laptop merk ini memang pada dasarknya dikhususkan untuk para gamer. Tahukah Anda? Laptop dari merk ini dibandrol dengan harga 10 juta keatas. Jadi, akan sangat boros apabila digunakan untuk hal-hal yang sederhana saja. "
            ),//5
            Item(
                image = R.drawable.laptophp,
                text = "Laptop HP ",
                detail = "Salah satu merk laptop terbaik yang banyak digunakan di Indonesia, HP memiliki keunggulan dimana hadir dengan penawaran harga yang sangat baik. Tak hanya itu, laptop dari merk ini juga diketahui memilki garansi  yang komprehensif hingga 3 tahun. Gimana? Apakah Anda salah satu pengguna laptop ini? Apakah Anda puas dengan harga dan fitur yang dihadirkan? Merk laptop HP ini diakui memiliki dukungan pelanggan yang baik sehingga mampu menjadi salah satu merk laptop yang terbaik tahun 2022. "
            ),//6
            Item(
                image = R.drawable.laptopmicrosoft,
                text = "Laptop Microsoft Surface ",
                detail = "Walau sangat jarang ditemukan di Indonesia, laptop merk Microsoft banyak digunakan di berbagai belahan dunia. Mungkin merk microsoft ini masih terbilang baru untuk produk laptop, namun siapa sangka bahwa laptop ini disambut baik di pasar elektronik. Laptop keluaran microsoft ini memiliki desain dan kekutan yang cukup mumpuni untuk digunakan saat bekerja. \n\n Tak hanya itu, merk laptop ini juga mengahadirkan produk dengan segmen harga yang cukup bervariasi sehingga cocok untuk target pasar yang bervariasi pula."
            ),//7
            Item(
                image = R.drawable.laptopacer,
                text = "Laptop Acer ",
                detail = "Berikutnya ada merk Acer. Apakah Anda salah satu pengguna laptop dari merk yang satu ini? Merk ini sudah sangat terkenal di Indonesia dan tahukah Anda? Bahwa penjualan laptop merk Acer di Indonesia mampu menaikkan penjualan laptop merk ini di dunia. \n\nIndonesia merupakan salah satu pengguna laptop merk Acer terbanyak. Wajar saja, laptop ini hadir dengan segmen haga yang sangat bervariasi dan cocok untuk banyak kalangan. Jika Anda ingin laptop mahal, merk ini menyediakan prdouk yang Anda inginkan. Namun, jika Anda ingin laptop yang tergolong murah, merk ini juga memiliki produk yang Anda cari. "
            ),//8
            Item(
                image = R.drawable.laptopsamsung,
                text = "Laptop Samsung Galaxy Book ",
                detail = "Berikutnya ada merk Laptop dari Korea Selatan yaitu Samsung. Mungkin merk ini sudah sangat terkenal sampai keseluruh dunia. Wajar saja, smartphone keluaran merk ini sangatlah di tunggu dan disukai oleh pasar elektronik. Namun, tak hanya smartphone nya saja, merk samsung juga dikenal menjadi merk laptop terbaik 2021. Merk ini hadir dengan membawa laptop yang memiliki warna yang colorfull. \n\nJika pada awalnya kurang dilirik oleh pasar, merk laptop yang satu ini mengeluarkan laptop dengan desainnya yang unik dan juga spesifikasinya yang cukup mumpuni yang kemudian dibandrol dengan harga yang sangat terjangkau, laptop merk sambung ini akan meningkat dengan sangat drastis. "
            ),//9
            Item(
                image = R.drawable.laptoptoshiba,
                text = "Laptop Toshiba ",
                detail = "Walau dikenal dengan merk barang-barang elektronik seperti TV, merk Toshiba juga kini mengeluarkan produk laptop. Ini adalah merk laptop terbaik 2021 yang terakhir. Merk laptop yang satu ini tak hanya dikenal di Indonesia saja melainkan sampai keseluruh penjuru dunia. Produk yang dikeluarkan oleh toshiba ini sebenarnya sangatlah bagus, namun perusahaan asal Jepang ini kini resmi menutup dan menghentikan produk laptopnya dan berfokus pada produk awal yang mereka produksi. Dan kini semua produk laptop toshiba ini sudah dimiliki oleh Sharp. \n\nItulah 10 merk laptop terbaik 2021. Setiap merk masing-masing teentunya memiliki kelebihan dan kekurangan. Dan untuk memilih salah satunya, pastikan kelebihan dari laptop tersebut adalah kebutuhan Anda."
            ),//10

        )
    }

}
