package pl.learn.anything.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_def_body.*
import pl.learn.anything.R

class DefFragment : Fragment() {

    private lateinit var defToDisplay:String
    private lateinit var imgName:String


    companion object{
        @JvmStatic
        fun newInstance(def:String,imgName:String="") = DefFragment().apply {
            arguments = Bundle().apply {
                putString("def",def)
                putString("imgName",imgName)
            }
        }.apply {
            this.defToDisplay = def
            this.imgName = imgName
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_def_body,container,false)
    }

    override fun onStart() {
        super.onStart()
        textView_def_bodyText.text = defToDisplay
        imageView_defImg.setImageResource(resources
            .getIdentifier(imgName,getString(R.string.images_folder_name_text),activity?.packageName))
    }



}