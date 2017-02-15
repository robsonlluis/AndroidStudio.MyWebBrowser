package com.rsouza.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference:
        //https://www.eduonix.com/blog/android-tutorials/learn-create-web-browser-application-using-android-studio/

        final Button btnGo = (Button) findViewById(R.id.btnGo);
        final EditText edtURL = (EditText) findViewById(R.id.edtURL);

        final WebView webView= (WebView)findViewById(R.id.webView);
        //findViewById returns an instance of View ,which is casted to target class
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        //This statement is used to enable the execution of JavaScript.

        webView.setVerticalScrollBarEnabled(false);
        //This statement hides the Vertical scroll bar and does not remove it.

        webView.setHorizontalScrollBarEnabled(false);
        //This statement hides the Horizontal scroll bar and does not remove it.

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(edtURL.getText().toString());
            }
        });
    }
}
