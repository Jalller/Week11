public class Main {

    public static void main(String[] args) {

        Account[] myAccounts = new Account[4];
        myAccounts[0] = new Account("1/3/09 14:44","Product1",1200,"Visa", "4593781145107322","Gouya","Echuca","Victoria","Australia","9/25/05 21:13","1/3/09 14:22",-36.1333333,144.75);
        myAccounts[1] = new Account("1/5/09 11:37", "Product1",1200,"Visa","4234120954489197","Janet","Ontario","","Canada","1/5/09 9:35","1/5/9 19:24",45.4166667,-75.7);
        myAccounts[2] = new Account("1/5/09 20:00","Product1",3600,"Visa","4904344348439820","James","Burpengary","Queensland","Australia","12/10/08 19:53","1/8/08 17:58",-27.166666,152.95);
        myAccounts[3] = new Account("1/3/09 13:24","Product1",1200,"Visa","4737470823565213","Mehmet Faith","Helsingor","Frederiksborg","Denmark","1/3/09 12:47","1/9/09 11:14",56.0333333,12.6166667);

        //myAccounts[0].setCreditCard(Integer.parseInt(myAccounts[0].getCard_number()));
        myAccounts[0].setCreditCard(Integer.parseInt(String.valueOf(234234)));

        for (int i = 0;i<myAccounts.length;i++) {
            System.out.println(myAccounts[i].toString());
        }

    }
}
