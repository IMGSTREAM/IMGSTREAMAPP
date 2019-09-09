package com.example.imgstreamproject.util;


import android.os.AsyncTask;

public class OperationTask extends AsyncTask<Void, Integer, Boolean> {

    private Runnable runnable;

    public OperationTask() {
    }

    public OperationTask(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
    }

    public void run() {
        if (runnable != null) {
            this.execute(runnable);
        }
    }

    public OperationTask setRunnable(Runnable runnable) {
        this.runnable = runnable;
        return this;
    }


}
