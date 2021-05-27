public class Url {
    public static void main(String[] args) {
        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println("Имя сервера: " + getServerName(url));
    }

    private static String getServerName(String urlString) {
        final int startServerNameIndex = urlString.indexOf("://") + 3; // Первый индекс имени сервера
        final int slashIndex = urlString.indexOf("/", startServerNameIndex); // Первый индекс подстроки "слэш"

        if (slashIndex == -1) {
            return urlString.substring(startServerNameIndex);
        }

        return urlString.substring(startServerNameIndex, slashIndex);
    }
}
