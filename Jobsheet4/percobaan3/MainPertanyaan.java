public class MainPertanyaan {

    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "asede Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
        masinis, asisten);

        System.out.println(keretaApi.info());
    }
    
}
