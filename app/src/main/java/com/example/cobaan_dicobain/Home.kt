package com.example.cobaan_dicobain

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.viewpager2.widget.ViewPager2
import com.example.cobaan_dicobain.databinding.ActivityHomeBinding
import java.util.Timer
import java.util.TimerTask

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {

    private lateinit var imageSlider: ViewPager2
    private lateinit var imageSliderAdapter: ImageSliderAdapter
    private val imageList = listOf(
        R.drawable.offer_banner,
        R.drawable.nike_shoe_banner,
        R.drawable.adidas_visual_graphics
    )
    private var currentPage = 0
    private val timer = Timer()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        // Menginisialisasi ImageView dan Button
//        val splashImageView1 = view.findViewById<v>(R.drawable.offer_banner)
//        splashImageView1.setOnClickListener {
//            // Tindakan yang ingin dilakukan saat gambar diklik
//            // Misalnya, pindah ke aktivitas lain
//            val intent = Intent(requireContext(), SuperFlashSaleActivity::class.java)
//            startActivity(intent)
//        }
         //Menginisialisasi ImageView dan Button
        val splashImageButton1 = view.findViewById<ImageButton>(R.id.lovebtn)
        splashImageButton1.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), FavoriteActivity::class.java)
            startActivity(intent)

        }

        val splashLinearLayout1 = view.findViewById<LinearLayout>(R.id.layoutFSproduct1)
        splashLinearLayout1.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout2 = view.findViewById<LinearLayout>(R.id.layoutFSproduct2)
        splashLinearLayout2.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout3 = view.findViewById<LinearLayout>(R.id.layoutFSproduct3)
        splashLinearLayout3.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout4 = view.findViewById<LinearLayout>(R.id.layoutFSproduct4)
        splashLinearLayout4.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout5 = view.findViewById<LinearLayout>(R.id.layoutFSproduct5)
        splashLinearLayout5.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }

        val splashLinearLayout6 = view.findViewById<LinearLayout>(R.id.layoutMSproduct1)
        splashLinearLayout6.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout7 = view.findViewById<LinearLayout>(R.id.layoutMSproduct2)
        splashLinearLayout7.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout8 = view.findViewById<LinearLayout>(R.id.layoutMSproduct3)
        splashLinearLayout8.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout9 = view.findViewById<LinearLayout>(R.id.layoutMSproduct4)
        splashLinearLayout9.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout10 = view.findViewById<LinearLayout>(R.id.layoutMSproduct5)
        splashLinearLayout10.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }

        val splashLinearLayout11 = view.findViewById<LinearLayout>(R.id.producthome1)
        splashLinearLayout11.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout12 = view.findViewById<LinearLayout>(R.id.producthome2)
        splashLinearLayout12.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout13 = view.findViewById<LinearLayout>(R.id.producthome3)
        splashLinearLayout13.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
        val splashLinearLayout14 = view.findViewById<LinearLayout>(R.id.producthome4)
        splashLinearLayout14.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        imageSlider = rootView.findViewById(R.id.imageSlider)
        imageSliderAdapter = ImageSliderAdapter(requireContext(), imageList)
        imageSlider.adapter = imageSliderAdapter

        // Auto start image slider
        val handler = Handler(Looper.getMainLooper())
        val update = Runnable {
            if (currentPage == imageList.size) {
                currentPage = 0
            }
            imageSlider.setCurrentItem(currentPage++, true)
        }
        timer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(update)
            }
        }, 2000, 3000) // Delay 2 seconds, repeat every 3 seconds

        return rootView
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

    }




}
