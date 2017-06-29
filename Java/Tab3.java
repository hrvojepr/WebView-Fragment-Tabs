//
// Carson Miller @4rsons
// WebView Fragment Tabs
// Thursday, June 29th, 2017
//

package android.polksheriff.org;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Tab3 extends Fragment {

    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);

        webView = (WebView)view.findViewById(R.id.webview3);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.reddit.com");

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return false; } });

        return view;
        // Back-up: return inflater.inflate(R.layout.tab1, container, false);

    }

}
