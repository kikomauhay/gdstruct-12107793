public class Main {
    public static void main(String[] args){
        Player rxnkou = new Player(1,"Rxnkou",100);
        Player mxtsukee = new Player(2,"Mxtsukee",50);
        Player reihns = new Player(3,"Reihns", 75);
        Player shim = new Player (4,"Shim",80);
        Player kayze = new Player (5,"Kayze", 200);
        Player pandora = new Player(6,"Pandora",50);
        Player tekoshi = new Player(7,"Tekoshi",999);
        Player godric = new Player(8,"Godric",60);
        Player sonic = new Player(9,"Sonic",150);
        

        SimpleHashtable players = new SimpleHashtable();

        players.put(rxnkou.getUsername(), rxnkou);
        players.put(mxtsukee.getUsername(), mxtsukee);
        players.put(reihns.getUsername(), reihns);
        players.put(shim.getUsername(),shim);
        players.put(kayze.getUsername(), kayze);
        players.put(pandora.getUsername(), pandora);
        System.out.println("Hashtable: ");
        players.printHashtable();

        players.put(sonic.getUsername(),sonic);
        players.put(tekoshi.getUsername(), tekoshi);
        players.put(godric.getUsername(), godric);
        System.out.println("\nUpdated Hashtable: ");
        players.printHashtable();

        String key = mxtsukee.getUsername();
        System.out.println("\nPlayer at key " + key + " = " + players.get(key));

        key = pandora.getUsername();
        System.out.println("\nRemoving player at key " + key + " = " +players.remove(key));
        System.out.println("\nUpdated Hashtable: ");
        players.printHashtable();

        key = rxnkou.getUsername();
        System.out.println("\nRemoving player at key " + key + " = " +players.remove(key));
        System.out.println("\nUpdated Hashtable: ");
        players.printHashtable();
    }
}
