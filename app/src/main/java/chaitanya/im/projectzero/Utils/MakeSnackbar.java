package chaitanya.im.projectzero.Utils;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.support.design.widget.Snackbar;

import chaitanya.im.projectzero.R;

public class MakeSnackbar {

    public static void show (Context context, String snackbarMessage, View coordinatorLayoutView) {

        int defaultColor = ContextCompat.getColor(context, R.color.colorAccent);
        Snackbar snackbar = Snackbar
                .make(coordinatorLayoutView, snackbarMessage, Snackbar.LENGTH_LONG);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(defaultColor);
        snackbar.show();
    }
}