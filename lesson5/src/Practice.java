public class Practice {
    public static void main(String[] args) {

        String log = "Error [Log down server]";

        if (log.toLowerCase().contains("error")) {
            int indexStartErro = log.indexOf("[");
            int indexEndError = log.indexOf("]");
            String s = log.substring(indexStartErro + 1, indexEndError);
            System.out.println(s);

        }
    }
}
