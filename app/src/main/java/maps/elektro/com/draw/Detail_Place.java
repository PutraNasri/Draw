package maps.elektro.com.draw;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.app.Activity;


public class Detail_Place extends Activity {

    String nama_place;
    TextView namaPlace,infoPlace,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__place);
        namaPlace=(TextView) findViewById(R.id.nama_place);
        infoPlace=(TextView) findViewById(R.id.info_place);
        Intent intent = getIntent();
        nama_place = intent.getStringExtra("nama_place");
        namaPlace.setText(nama_place);
        setInfo(nama_place);
    }
    public void setInfo(String place){
        if(place.equalsIgnoreCase("Lampuuk")) {

            infoPlace.setText("Pantai Lampuuk memiliki garis pantai sepanjang sekitar 5 kilometer. Pantai ini berpasir putih bersih nan lembut, " +
                    "air laut berwarna biru kehijauan, dan ombak yang bersahabat untuk para peselancar. Ke arah daratan terdapat pepohonan " +
                    "pinus yang rimbun dan lebih jauh lagi terlihat deretan pegunungan yang hijau. Lokasi Pantai Lampuuk persisnya di wilayah " +
                    "barat Aceh, sekitar 15 kilometer dari Banda Aceh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.lampuuk);


        }else if(place.equalsIgnoreCase("Pasir Putih")){
            infoPlace.setText("Santai, renang, snorkeling, memancing, watersport dan berfoto ria bisa dilakukan di " +
                    "Pantai Pasir Putih Lhok Mee yang berlokasi di Desa Lamreh, Kecamatan Mesjid Raya, Kabupaten Aceh Besar. " +
                    "Lokasi yang alami, membuat suasana libur Anda lebih asyik");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.pasir);
        }else{}

        if(place.equalsIgnoreCase("Iboih Sabang")) {
            infoPlace.setText("Berada di ujung barat Pulau Sumatera, Pantai Iboih menawarkan kecantikan alam yang masih alami. Air " +
                    "lautnya begitu jernih, belum lagi jika menyelam, Anda akan disambut dengan kerajaan bawah laut yang megah");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.iboih);


        }else if(place.equalsIgnoreCase("Tugu Nol KM")){

                infoPlace.setText("Pemandangan dari atas tugu sungguh sangat menawan dimana membentang samudera lepas yang seakan tak terbatas. " +
                        "Mengapa tidak tunggulah hingga Matahari larut di birunya air laut Samudera Hindia. Menikmati sunset di ujung paling " +
                        "barat kepulauan di Indonesia ini tak mungkin tersandingkan dengan pengalaman sunset serup di bagaian lainnya kecuali " +
                        "Tugu Nol Kilometer di Merauke.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.tugu);
        }else{}
        if(place.equalsIgnoreCase("lhong")) {
            infoPlace.setText("di banda aceh");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.lhong);


        }else if(place.equalsIgnoreCase("Lhouk mata ie")){
            infoPlace.setText("Lhok Mata Ie adalah sebuah pantai di Aceh Besar. Untuk menuju ke sana," +
                    "pengunjung harus menaiki bukit terlebih dahulu. Memang letak pantai ini di balik bukit Ujong Pancu. " +
                    "Letak tempat ini dari Kota Banda Aceh tidaklah jauh. Hanya dibutuhkan waktu sekitar 15 menit " +
                    "menuju bukit Ujong Pancu.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.lhokmata);
        }else{}
        if (place.equalsIgnoreCase("Pantai ulee lheue")) {
            infoPlace.setText("     Walau habis diterjang ombak tsunami,tak menjadikan pantai ini hilang pesonanya, " +
                    "pantai Ulee Lheue ini masih terlihat sangat indah dan bahkan sudah mulai cukup ramai dikunjungi " +
                    "oleh masyarakat lokal termasuk pula wisatawan asing. Sudah dibangunnya tanggul pengaman dan " +
                    "jalan dua jalur yang menuju pelabuhan penyeberangan Ulhe Lhee, menambah akses ke tempat ini semakin mudah " +
                    "dan nyaman untuk dikunjungi.");

            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.ulele);

        } else if (place.equalsIgnoreCase("Waterboom ulee lheue")) {
            infoPlace.setText("Ini merupakan tempat wisata air yang banyak dikunjungi oleh wisatawan lokal. Keberadaan " +
                    "Waterboom ini merupakan magnet wisata di daerah Aceh sehingga memancing kedatangan wisatawan dari berbagai daerah");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
             imageView.setImageResource(R.drawable.waterule);
        } else {
        }

        //edit lagi image nya

        if (place.equalsIgnoreCase("Mataie Hillside")) {
            infoPlace.setText("    Wahana Water Boom ini cukup mudah diakses dari pusat kota. Meski terhitung dekat dari kota, " +
                    "objek wisata air ini menghadirkan keunggulan berupa pemandangan alam yang indah di sepanjang perjalanan.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.mataieh);


        } else if (place.equalsIgnoreCase("Wisata Alam Taman Rusa")) {
            infoPlace.setText("Taman Rusa yang terletak di Kawasan aceh besar, tepatnya di kecamatan sibreh desa Lamtanjung " +
                    "merupakan sebuah taman hiburan dan taman bermain keluarga. Taman yang terletak di kawasan yang masih hijau " +
                    "dan asri ini dapat menjadi sebuah tempat liburan bagi keluarga yang ingin menikmati keindahan alam dan jauh " +
                    "dari polusi udara dan hiruk pikuk kenderaan.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.tamanrusas);


        } else {
        }
        if (place.equalsIgnoreCase("Wahana impian Malaka")) {
            infoPlace.setText("   Air Terjun Kuta Malaka, keindahan alam yang tersembunyi di balik gugus Bukit Barisan " +
                    "di Kabupaten Aceh Besar.  Jarak lokasi air terjun itu sekitar 45 kilometer dari Banda Aceh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.impian_malaka);


        } else if (place.equalsIgnoreCase("waduk keliling")) {
            infoPlace.setText("   Waduk Keuliling yang terdapat di desa Lam Leuot, kecamatan Kuta Cot Glie, " +
                    "Aceh Besar tersebut memiliki pemandangan yang asri khas perbukitan yang mampu membawa anda " +
                    "sejenak keluar dari beban rutinitas.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.waduk_keliling);


        } else {
        }
        if (place.equalsIgnoreCase("Saree Aceh")) {
            infoPlace.setText("   Dibalik keindahan yang ada pada gunung seulawah terdapat banyak potensi yang tersimpan," +
                    "seperti Sumber Daya alamnya yang begitu sangat luar biasa di samping sebagai tempat objek wisata yang " +
                    "begitu menakjubkan,seperti sumber alam hayati dan hewani,atau jenis flora dan faunanya yang beraneka ragam " +
                    "yang hidup di kawasan gunung tersebut");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.sareaceh);


        } else if (place.equalsIgnoreCase("Freddies Santai Sumurtiga")) {
            infoPlace.setText("di Sabang");


        } else {
        }
        if (place.equalsIgnoreCase("Gunung Berapi Jaboi")) {
            infoPlace.setText("  Kawah volkano jaboi yang berlokasi di Gampong Jaboi, 15 kilometer dari pusat kota Sabang, " +
                    "Aceh merupakan sajian satu dari menifestasi panas bumi. Kawah Volkano Jaboi ini menjadi tempat wisata " +
                    "masyarakat Kota Sabang, Aceh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.gunungg);


        } else if (place.equalsIgnoreCase("Pantai Sumur Tiga")) {
            infoPlace.setText("   Pastikan kunjungan Anda saat ke Sabang menyambangi keindahan yang alami dan damai dari Pantai Sumur Tiga. " +
                    "Lokasinya nan menawan hati di pantai timur Pulau Weh, sekira 15 menit dari Kota Sabang, tepatnya di Kecamatan Ie Meule, " +
                    "Sukajaya, Sabang, Pulau Weh, Provinsi Aceh. Pantai ini akan memukau siapa pun yang menyambanginya. ");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.sumur3);


        } else {
        }
        if (place.equalsIgnoreCase("Casanemo")) {
            infoPlace.setText("   Resort ini memiliki fasilitas yang cukup lengkap dengan pelayanannya yang ramah dan sangat membantu anda. " +
                    "Belum lagi jika anda sangat ingin mendapat resort dengan pemandangan alami yang indah, Casa Nemo Beach Resort Aceh " +
                    "inilah jawabannya.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.casanemo);


        } else if (place.equalsIgnoreCase("Benteng Jepang")) {
            infoPlace.setText("  Benteng Anoi Itam, hanyalah salah satu benteng peinggalan serdadu jepang yang berada di pulau weh. " +
                    "Lokasi Benteng Anoi Itam ini berada di kawasan Pantai Anoi Itam, tepatnya di Jalan Ujung Kareung, Kota Sabang, " +
                    "Pulau weh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.benteng);


        } else {
        }
        if (place.equalsIgnoreCase("Pantai Anoi Itam")) {
            infoPlace.setText("  Dari sekian banyak pantai di Pulau Weh, mungkin pantai yang satu ini yang paling berbeda. " +
                    "Pantai Anoi Itam yang berjarak 13 km dari Kota Sabang adalah satu-satunya pantai yang berpasir hitam di " +
                    "pulau ini. Anoi Itam sendiri memang berarti 'pasir hitam'. Keindahan eksotis pantai ini telah mengantarkannya " +
                    "meraih predikat sebagai salah satu pantai tercantik di Nusantara versi majalah Garuda Indonesia.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.ano_itam);


        } else if (place.equalsIgnoreCase("Pantai gapang")) {
            infoPlace.setText("  Pantai Gapang di Kota Sabang, Pulau Weh, adalah salah satu pilihan wisata bahari saat Anda kunjungi " +
                    "saat bertandang ke Provinsi Nanggroe Aceh Darussalam. Para penjelajah dunia (backpackers) juga menjadikan pantai " +
                    "ini masuk dalam list perjalanan mereka merapat di Pelabuhan Balohan kemudian meluncur ke bagian barat pulau ini " +
                    "sekira 1 jam perjalanan berkelok naik turun. ");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.pantai_gapang);


        } else {
        }
        if (place.equalsIgnoreCase("Sabang Fair")) {
            infoPlace.setText("  Sebuah tempat festival yang akan diadakan Aneka Lomba Seni Budaya Aceh Pameran Kreatifitas Daerah" +
                    "Pawai Budaya Panggung Hiburan Rakyat Prosesi Ulang Tahun Kota Sabang ");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.sabangfair);


        } else if (place.equalsIgnoreCase("Pantan Terong, Takengon")) {
            infoPlace.setText("  Pantan Terong adalah sebuah bukit yang terletak di puncak bukit Dataran Tinggi Gayo Takengon " +
                    "Kabupaten Aceh Tengah. Di tempat ini kita bisa melihat ibu kota Takengon dan Danau Laut Tawar secara " +
                    "keseluruhan, lapangan Pacuan Kuda Belang Bebangka di Kecamatan Pegasing, bandara udara Rembele dari atas, " +
                    "dengan diapit serta dikelilingi punggung gunung bukit barisan yang elok. Pantan Terong terletak di kecamatan Bebesan," +
                    "7.5 km dari kota Takengon, Kabupaten Aceh Tengah");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.pantang);


        } else {
        }
        if (place.equalsIgnoreCase("Danau Laut Tawar")) {
            infoPlace.setText("Keberadaan Danau Laut Tawar menjadi kebanggaan masyarakat Aceh. Ia merupakan objek wisata alam yang banyak " +
                    "dikunjungi wisatawan domestik maupun mancanegara. Danau ini menjadi sumber air yang dimanfaatkan tidak hanya oleh " +
                    "masyarakat di Kabupaten Aceh Tengah, namun juga oleh masyarakat di kabupaten-kabupaten lainnya.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.danaulaut);


        } else if (place.equalsIgnoreCase("Pulau Banyak")) {
            infoPlace.setText("Pulau Banyak merupakan salah satu kecamatan di Kabupaten Aceh Singkil. Letaknya di perairan Samudra Hindia atau " +
                    "sekitar 20 mil laut (37,04 kilometer) dari daratan Sumatera. Pulau ini terdiri dari 99 pulau besar dan kecil. Gugusan pulau " +
                    "di Kabupaten Aceh Singkil, Aceh ini bagaikan perawan karena keindahan alamnya yang masih alami, berupa pantai berpasir putih " +
                    "bersih, laut jernih, dan langit biru.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.pulobyak);


        } else {
        }
        if (place.equalsIgnoreCase("Pulo Aceh")) {
            infoPlace.setText("Pulo Aceh adalah sebuah kecamatan di Kabupaten Aceh Besar Provinsi Nanggroe Aceh Darussalam [sekarang Provinsi " +
                    "Aceh]. Merupakan daerah/wilayah yang terletak paling barat di Indonesia. Untuk ke Pulo Aceh atau ke desa Meulingge " +
                    "sobat bisa menggunakan jasa transportasi KM. SULTAN BAHARI atau KM. JASA BUNDA 01 melalui pelabuhan Lampulo");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.puloaceh);


        } else if (place.equalsIgnoreCase("Pantai Jantang")) {
            infoPlace.setText("Pantai ini terletak di Lhoong, Aceh Besar, Tepatnya di desa Jantang Meunasah Krueng Kala Pasie Blang Raya. " +
                    "Butuh waktu sekitar 1 jam lebih kalau berangkat dari Banda Aceh. Tempat detailnya pas didepan tambang bijih besi di " +
                    "lhoong.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.jantang);


        } else {
        }
        if (place.equalsIgnoreCase("Air Terjun Suhom")) {
            infoPlace.setText("  Pepohonan rimbun nan hijau, udara segar, dan bunyi gemuruh air jatuh dari sela bebatuan di perbukitan menuju " +
                    "telaga biru menjadi kombinasi yang memberikan efek relaksasi ketika berada di kawasan Air Terjun Suhom, Kecamatan Lhoong, " +
                    "Kabupaten Aceh Besar, Provinsi Aceh. Kawasan ini menjadi alternatif wisata bahari yang sudah umum di Bumi Serambi Mekkah.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.airterjunsuhom);


        } else if (place.equalsIgnoreCase("Brayeung Leupung")) {
            infoPlace.setText("Objek wisata Brayeung terletak di Desa Leupung, kabupaten Aceh Besar,. Lokasinya melewati jalan utama Banda Aceh Meulaboh, " +
                    "menelusuri pesisir pantai, melewati sekitar 1 - 5 km setelah pabrik semen Andalas di Lhoknga, Aceh Besar. Objek wisata Brayeung ini " +
                    "Jaraknya sekitar  25 km dari Kota Banda Aceh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.brayeungg);


        } else {
        }
        if (place.equalsIgnoreCase("Air Panas")) {
            infoPlace.setText("   SUMBER air panas alami berasal dari gunung berapi Seulawah merupakan salah satu objek wisata andalan di Desa " +
                    "Ie Suum, Kecamatan Mesjid Raya, Aceh Besar yang terletak di kaki Gunung Meuh atau berjarak sekitar 35 kilometer dari Kota" +
                    "Banda Aceh.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.air_panas);


        } else if (place.equalsIgnoreCase("Bukit Lamreh")) {
            infoPlace.setText("alam Indonesia begitu indah dan mempesona. Lamreh adalah salah satu contoh nyatanya. Desa ini berada di Aceh Besar, " +
                    "tepatnya di kecamatan Krueng Raya, sekitar 1 km dari pelabuhan Malahayati, Aceh Besar. Keindahan Lamreh sudah tidak perlu " +
                    "diragukan lagi.");
            ImageView imageView = (ImageView) findViewById(R.id.image_View2);
            imageView.setImageResource(R.drawable.bukit_lamreh);


        } else {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail__place, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClicktombolmaps(View view) {
        TextView nama_plac=(TextView) findViewById (R.id.nama_place);
        String nama=nama_plac.getText().toString();
        Intent intent= new Intent(getApplicationContext(),maps_banda.class);
        intent.putExtra("nama", nama);
        startActivity(intent);

    }

}
