package com.yt.fragmentvenavigation

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.yt.fragmentvenavigation.databinding.FragmentBirinciBinding


class birinciFragment : Fragment() {
    private var _binding: FragmentBirinciBinding?= null
    private val binding get()= _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentBirinciBinding.inflate(inflater,container,false)
        val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.edittext.setText("")
        binding.button.setOnClickListener{
            sonraki(it)
        }
        Toast.makeText(requireContext(), "hosgeldiniz",Toast.LENGTH_LONG).show()
    }

    fun sonraki(view:View){
        val isim= binding.edittext.text.toString()
        val action= birinciFragmentDirections.actionBirinciFragmentToIkinciFragment(isim)
        Navigation.findNavController(view).navigate(action)


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding= null
    }



}