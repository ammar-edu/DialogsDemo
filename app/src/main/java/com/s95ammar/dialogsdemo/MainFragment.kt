package com.s95ammar.dialogsdemo

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.dialog1_button).setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle(R.string.alert_dialog_title)
                .setMessage(R.string.alert_dialog_description)
                .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                    // handle "Cancel" click
                })
                .setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, which ->
                    // handle "Ok" click
                })
                .show()
        }

        view.findViewById<Button>(R.id.dialog2_button).setOnClickListener {
/*
            childFragmentManager.beginTransaction().add(
                MyCustomDialog.newInstance(),
                MyCustomDialog::class.java.simpleName
            ).commit()
*/

            MyCustomDialog.newInstance().show(childFragmentManager, MyCustomDialog::class.java.simpleName)
        }


    }
}