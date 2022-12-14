    public void get_ip( )
    {
        webscraping ws = new webscraping();
        ws.execute();
    }

    public class  webscraping extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Document doc = Jsoup.connect("http://whatismyip.akamai.com/").userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
                        .get();
                String text = doc.body().text();
                Log.e( "external ip: ", text);
            } catch (IOException e) {
                Log.e( "get_ip: ","exception " + e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
        }
    }
