package com.example.mymarketalisa.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mymarketalisa.databinding.FragmentHomeBinding

class MyFavoritesProductsFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(MyFavoriteProductsViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return  binding.root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}