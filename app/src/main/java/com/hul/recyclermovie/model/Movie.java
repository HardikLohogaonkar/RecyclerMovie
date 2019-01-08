package com.hul.recyclermovie.model;

import java.util.List;

public class Movie {

    /**
     * results : [{"vote_count":98,"id":504172,"video":false,"vote_average":5.9,"title":"The Mule","popularity":185.518,"poster_path":"/t0idiLMalKMj2pLsvqHrOM4LPdQ.jpg","original_language":"en","original_title":"The Mule","genre_ids":[80,18,53],"backdrop_path":"/rQiFIneBiShab7siVvufRPev9oQ.jpg","adult":false,"overview":"A 90-year-old horticulturalist and Korean War veteran is caught transporting $3 million worth of cocaine through Illinois for a Mexican drug cartel.","release_date":"2018-12-14"},{"vote_count":619,"id":404368,"video":false,"vote_average":7.4,"title":"Ralph Breaks the Internet","popularity":159.413,"poster_path":"/8GCoHKfNe4kK0yWhJDYKyM7Zbxk.jpg","original_language":"en","original_title":"Ralph Breaks the Internet","genre_ids":[10751,16,35,14],"backdrop_path":"/88poTBTafMXaz73vYi3c74g0y2k.jpg","adult":false,"overview":"Six years after the events of \"Wreck-It Ralph,\" Ralph and Vanellope, now friends, discover a wi-fi router in their arcade, leading them into a new adventure.","release_date":"2018-11-20"},{"vote_count":436,"id":480530,"video":false,"vote_average":6.4,"title":"Creed II","popularity":153.608,"poster_path":"/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg","original_language":"en","original_title":"Creed II","genre_ids":[18,28],"backdrop_path":"/8yqLPNwNCtpOPc3XkOlkSMnghzw.jpg","adult":false,"overview":"Follows Adonis Creed's life inside and outside of the ring as he deals with new found fame, issues with his family, and his continuing quest to become a champion.","release_date":"2018-11-20"},{"vote_count":841,"id":324857,"video":false,"vote_average":8.5,"title":"Spider-Man: Into the Spider-Verse","popularity":152.156,"poster_path":"/laMM4lpQSh5z6KIBPwWogkjzBVQ.jpg","original_language":"en","original_title":"Spider-Man: Into the Spider-Verse","genre_ids":[28,12,16,878,35],"backdrop_path":"/uUiId6cG32JSRI6RyBQSvQtLjz2.jpg","adult":false,"overview":"Miles Morales is juggling his life between being a high school student and being Spider-Man. However, when Wilson \"Kingpin\" Fisk uses a super collider, another Spider-Man from another dimension, Peter Parker, accidentally winds up in Miles' dimension. As Peter trains Miles to become a better Spider-Man, they are soon joined by four other Spider-Men from across the \"Spider-Verse\". As all these clashing dimensions start to tear Brooklyn apart, Miles must help the others stop Fisk and return everyone to their own dimensions.","release_date":"2018-12-07"},{"vote_count":18,"id":505954,"video":false,"vote_average":4.8,"title":"T-34","popularity":110.556,"poster_path":"/wNJF8R5QE6nBT7DQoKk8t6YD1MM.jpg","original_language":"ru","original_title":"Т-34","genre_ids":[10752,18,12],"backdrop_path":"/vDx8XxfYjkn573bCFGF6SkdM33Q.jpg","adult":false,"overview":"1941 - WWii. the second lieutenant Nikolai ivushkin, commander of a t-34, engages in an unequal battle against the tank ace Klaus Jager in a battle near moscow. His mission is more of a suicide - to destroy a dozen german tanks, all by himself. that said, luck does favour the bold. He wins the battle, barely survives, but loses his tank and lands himself in captivity for three long years... there was little to no chance for ivushkin and Jager to meet again, but the war knows how to throw a curve ball.in the spring of 1944, the Wehrmacht commands Jager to take charge of the ohrdruf  re range and turn it into a training center for elite german armored forces, using the latest t-34 as a running target. this is how Jager and ivushkin cross paths again. Jager o ers ivushkin to become the commander of a legendary tank and pick his crew from fellow camp prisoners. Nothing goes according to plan, though, when ivushkin uses exercises for a daring and carefully planned escape.","release_date":"2018-12-27"},{"vote_count":466,"id":428078,"video":false,"vote_average":6.1,"title":"Mortal Engines","popularity":110.024,"poster_path":"/uXJVpPXxZO4L8Rz3IG1Y8XvZJcg.jpg","original_language":"en","original_title":"Mortal Engines","genre_ids":[878,28,12],"backdrop_path":"/rxYG6Sj95as9rv9wKIHUx6ATWd3.jpg","adult":false,"overview":"Set in a world many thousands of years in the future. Earth\u2019s cities now roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive Traction Cities, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the Outlands who will change the course of his life forever.","release_date":"2018-12-06"},{"vote_count":38,"id":300681,"video":false,"vote_average":5.5,"title":"Replicas","popularity":107.933,"poster_path":"/kEuIYDEJ9ReBbJLb7QeP9KdbjEe.jpg","original_language":"en","original_title":"Replicas","genre_ids":[53,878,9648],"backdrop_path":"/sHPfBVFq7dlnXCz1zFdbEdwcBDJ.jpg","adult":false,"overview":"A scientist becomes obsessed with bringing back his family members who died in a traffic accident.","release_date":"2018-11-01"},{"vote_count":379,"id":375588,"video":false,"vote_average":5.9,"title":"Robin Hood","popularity":103.91,"poster_path":"/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg","original_language":"en","original_title":"Robin Hood","genre_ids":[12,28,53],"backdrop_path":"/AuA50D7T7S7OEVcGo0ZKaMhERn0.jpg","adult":false,"overview":"A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.","release_date":"2018-11-20"},{"vote_count":117,"id":375262,"video":false,"vote_average":7.6,"title":"The Favourite","popularity":101.588,"poster_path":"/4hgPWxYeGWtTEx9BPhUo99wj77z.jpg","original_language":"en","original_title":"The Favourite","genre_ids":[18,36,35],"backdrop_path":"/ekWMoBZ4B9rM60INZEh5FAD2HFR.jpg","adult":false,"overview":"In 18th century England, the close relationship between Queen Anne and Sarah Churchill is threatened by the arrival of Sarah's cousin, Abigail Hill, resulting in a bitter rivalry between the two cousins to be the Queen's favourite.","release_date":"2018-11-20"},{"vote_count":100,"id":503314,"video":false,"vote_average":7.2,"title":"Dragon Ball Super: Broly","popularity":99.662,"poster_path":"/518jdIQHCZmYqIcNCaqbZuDRheV.jpg","original_language":"ja","original_title":"Dragon Ball Super: Broly","genre_ids":[28,16,878],"backdrop_path":"/6OTRuxpwUUGbmCX3MKP25dOmo59.jpg","adult":false,"overview":"Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called 'Broly' who they've never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so what's this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza (back from Hell) getting caught up in the mix.","release_date":"2018-12-14"},{"vote_count":237,"id":398173,"video":false,"vote_average":7.1,"title":"The House That Jack Built","popularity":62.471,"poster_path":"/pMabi1PjsVtHrHRf4S8yzdUTIWC.jpg","original_language":"en","original_title":"The House That Jack Built","genre_ids":[18,27,80,53],"backdrop_path":"/itdm9wqCo03NZ3CGSz5P7eiMo68.jpg","adult":false,"overview":"Failed architect, engineer and vicious murderer Jack tells Verge the details of some of his most elaborately orchestrated crimes, each of them a towering piece of art that defines his life's work as a serial killer for twelve years.","release_date":"2018-10-08"},{"vote_count":212,"id":442062,"video":false,"vote_average":5.7,"title":"Goosebumps 2: Haunted Halloween","popularity":62.162,"poster_path":"/kOrUF0EH2C3KHoI7tqANZMFZaTN.jpg","original_language":"en","original_title":"Goosebumps 2: Haunted Halloween","genre_ids":[12,35,14,10751,27],"backdrop_path":"/h5BvesqaxL7V3vl1CmaR8waGyiM.jpg","adult":false,"overview":"Two boys face an onslaught from witches, monsters, ghouls and a talking dummy after they discover a mysterious book by author R.\u202fL. Stine.","release_date":"2018-10-11"},{"vote_count":615,"id":347375,"video":false,"vote_average":5.9,"title":"Mile 22","popularity":59.834,"poster_path":"/2L8ehd95eSW9x7KINYtZmRkAlrZ.jpg","original_language":"en","original_title":"Mile 22","genre_ids":[28,53,12,80],"backdrop_path":"/2nOMUnQ4OtsKVTmpp3og7MYt4oG.jpg","adult":false,"overview":"An elite group of American operatives, aided by a top-secret tactical command team, must transport an asset who holds life-threatening information to an extraction point 22 miles away through the hostile streets of an Asian city.","release_date":"2018-08-16"},{"vote_count":95,"id":429197,"video":false,"vote_average":7.1,"title":"Vice","popularity":51.397,"poster_path":"/e0NZxqQ4B8YZ6kRrZish2DPqtdi.jpg","original_language":"en","original_title":"Vice","genre_ids":[18,36,35],"backdrop_path":"/uvy89JLcYEiUb0VOoSjkUrIW3nJ.jpg","adult":false,"overview":"George W. Bush picks Dick Cheney, the CEO of Halliburton Co., to be his Republican running mate in the 2000 presidential election. No stranger to politics, Cheney's impressive résumé includes stints as White House chief of staff, House Minority Whip and defense secretary. When Bush wins by a narrow margin, Cheney begins to use his newfound power to help reshape the country and the world.","release_date":"2018-12-25"},{"vote_count":93,"id":438808,"video":false,"vote_average":5.8,"title":"White Boy Rick","popularity":51.247,"poster_path":"/l15r2aLqdifXM9GFsJLkOq5Y8SI.jpg","original_language":"en","original_title":"White Boy Rick","genre_ids":[18,80],"backdrop_path":"/iphqiuA8HJg15Haw4Hkk2iyhWRo.jpg","adult":false,"overview":"The story of teenager, Richard Wershe Jr., who became an undercover informant for the police during the 1980s and was ultimately arrested for drug-trafficking and sentenced to life in prison.","release_date":"2018-09-14"},{"vote_count":100,"id":490132,"video":false,"vote_average":8.2,"title":"Green Book","popularity":45.48,"poster_path":"/h70wRv6iWxiqED4orqfxcEl74Rc.jpg","original_language":"en","original_title":"Green Book","genre_ids":[18,35],"backdrop_path":"/78PjwaykLY2QqhMfWRDvmfbC6EV.jpg","adult":false,"overview":"Tony Lip, a bouncer in 1962, is hired to drive pianist Don Shirley on a tour through the Deep South in the days when African Americans forced to find alternate accommodations and services due to segregation laws below the Mason-Dixon Line relied on a guide called The Negro Motorist Green Book.","release_date":"2018-11-16"},{"vote_count":42,"id":526051,"video":false,"vote_average":6.3,"title":"Look Away","popularity":39.931,"poster_path":"/ls9EPHID0zqXSooi5O03pRjoZ0r.jpg","original_language":"en","original_title":"Look Away","genre_ids":[27,53],"backdrop_path":"/x04SgdgxFGeNk2SLUnv9aXEuzQT.jpg","adult":false,"overview":"A timid and reclusive 18-year-old high school student is alienated by her parents and ruthlessly rejected by her peers. Desperate and isolated, she confides in her own reflection \u2014 and in the mirror she finds her imagined evil twin, someone who supports her, encourages her and knows all her secret desires. When the \u201cgirls\u201d trade places, repressed sexuality and a ferocious violence erupt with a dangerous sense of freedom.","release_date":"2019-01-10"},{"vote_count":73,"id":429203,"video":false,"vote_average":6.5,"title":"The Old Man & the Gun","popularity":39.206,"poster_path":"/a4BfxRK8dBgbQqbRxPs8kmLd8LG.jpg","original_language":"en","original_title":"The Old Man & the Gun","genre_ids":[35,80,18],"backdrop_path":"/8bRIfPGDnmWgdy65LO8xtdcFmFP.jpg","adult":false,"overview":"The true story of Forrest Tucker, from his audacious escape from San Quentin at the age of 70 to an unprecedented string of heists that confounded authorities and enchanted the public.  Wrapped up in the pursuit are a detective, who becomes captivated with Forrest\u2019s commitment to his craft, and a woman, who loves him in spite of his chosen profession.","release_date":"2018-09-27"},{"vote_count":79,"id":451915,"video":false,"vote_average":7.3,"title":"Beautiful Boy","popularity":37.199,"poster_path":"/i7gsLrNxpSf8NF5IZIrcOEfMyA3.jpg","original_language":"en","original_title":"Beautiful Boy","genre_ids":[18],"backdrop_path":"/sOhtC4cmaYPOlcjXCWxxrx2NKKn.jpg","adult":false,"overview":"After he and his first wife separate, journalist David Sheff struggles to help their teenage son Nic, who goes from experimenting with drugs to becoming devastatingly addicted to methamphetamine.","release_date":"2018-10-12"},{"vote_count":3,"id":450465,"video":false,"vote_average":0,"title":"Glass","popularity":33.048,"poster_path":"/aG5GS0V15Zpk8zvsww02faNT0QI.jpg","original_language":"en","original_title":"Glass","genre_ids":[53,27,9648,18,878],"backdrop_path":"/ngBFDOsx13sFXiMweDoL54XYknR.jpg","adult":false,"overview":"Following the conclusion of Split, Glass finds David Dunn pursuing Kevin Wendell Crumb\u2019s superhuman figure of The Beast in a series of escalating encounters, while the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.","release_date":"2019-01-16"}]
     * page : 1
     * total_results : 299
     * dates : {"maximum":"2019-02-01","minimum":"2019-01-07"}
     * total_pages : 15
     */

    private int page;
    private int total_results;
    private DatesBean dates;
    private int total_pages;
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public DatesBean getDates() {
        return dates;
    }

    public void setDates(DatesBean dates) {
        this.dates = dates;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class DatesBean {
        /**
         * maximum : 2019-02-01
         * minimum : 2019-01-07
         */

        private String maximum;
        private String minimum;

        public String getMaximum() {
            return maximum;
        }

        public void setMaximum(String maximum) {
            this.maximum = maximum;
        }

        public String getMinimum() {
            return minimum;
        }

        public void setMinimum(String minimum) {
            this.minimum = minimum;
        }
    }

    public static class ResultsBean {
        /**
         * vote_count : 98
         * id : 504172
         * video : false
         * vote_average : 5.9
         * title : The Mule
         * popularity : 185.518
         * poster_path : /t0idiLMalKMj2pLsvqHrOM4LPdQ.jpg
         * original_language : en
         * original_title : The Mule
         * genre_ids : [80,18,53]
         * backdrop_path : /rQiFIneBiShab7siVvufRPev9oQ.jpg
         * adult : false
         * overview : A 90-year-old horticulturalist and Korean War veteran is caught transporting $3 million worth of cocaine through Illinois for a Mexican drug cartel.
         * release_date : 2018-12-14
         */

        private int vote_count;
        private int id;
        private boolean video;
        private double vote_average;
        private String title;
        private double popularity;
        private String poster_path;
        private String original_language;
        private String original_title;
        private String backdrop_path;
        private boolean adult;
        private String overview;
        private String release_date;
        private List<Integer> genre_ids;

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
    }
}
