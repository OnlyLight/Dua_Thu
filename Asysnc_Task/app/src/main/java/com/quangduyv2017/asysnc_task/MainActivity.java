package com.quangduyv2017.asysnc_task;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvTieuDe;
    private ArrayList<String> arrayTitle;
    private ArrayList<String> arrayLink;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();

        arrayTitle = new ArrayList<>();
        arrayLink = new ArrayList<>();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayTitle);
        lvTieuDe.setAdapter(adapter);

        new ReadToInternet().execute("http://vnexpress.net/rss/so-hoa.rss");

        lvTieuDe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("Link", arrayLink.get(position)); // gữi đường link
                startActivity(intent); // Chuyển màn hình
            }
        });
    }

    public void addShow() {
        lvTieuDe = (ListView) findViewById(R.id.lvTieuDe);
    }

    private class ReadToInternet extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            StringBuilder content = new StringBuilder();

            try {
                URL url = new URL(params[0]);

                InputStream inputStream = url.openConnection().getInputStream();

                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line = "";

                while((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                }

                bufferedReader.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return content.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            XMLDOMParser parser = new XMLDOMParser();

            Document document = parser.getDocument(s); // Lấy nội dung

            NodeList nodeList = document.getElementsByTagName("item"); // Tìm thẻ item

            String tieuDe = "";
            String ndung = "";

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                tieuDe = parser.getValue(element, "title") + "\n"; // In ra title
                ndung = parser.getValue(element, "link") + "\n"; // Đưa ra đường link

                arrayLink.add(ndung); // add nội dung vào array
                arrayTitle.add(tieuDe); // add tiêu đề vào array
            }

            adapter.notifyDataSetChanged();
        }
    }
}
