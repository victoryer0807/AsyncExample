package ru.synergy.asyncexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class AsyncTaskExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task_example);

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute("Hello ");


    }
          public void onClick(View v){
          //TODO
          }


}
    class MyAsyncTask extends AsyncTask<String, Integer, Integer> {



        @Override
        protected Integer doInBackground(String... strings) {
            int myProgress = 0;

            publishProgress(myProgress);
            return null;
        }


        @Override //logika po vozvrasheniu rezultata i aktivnih poley
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }


        @Override //vivod  rezultata na ekran
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }
    }
