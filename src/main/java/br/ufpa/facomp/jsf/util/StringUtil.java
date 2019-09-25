package br.ufpa.facomp.jsf.util;


public final class StringUtil {

    public static String removeZerosInicio(String string) {
        return string.replaceFirst("^0+(?!$)", "");
    }


    public static String getPrimeiroNome(String name){
        if(name.split("\\w+").length>1){
            if(name.indexOf(' ')>0)
                return name.substring(0, name.indexOf(' '));
            else return name;
        }
        else{
            return name;
        }
    }
    public static String addHTTPPrefix(String site) {
        if(site!=null && site.trim().length()>0 && !( site.startsWith("https://") || site.startsWith("http://"))){
           return "http://"+site;
        }else return site;
    }


    public static String addUnderlinesBetweenWords(String text) {
        String[] words = text.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                result += words[i].replaceAll("[^\\w]", "");
            } else {
                result += words[i].replaceAll("[^\\w]", "").concat("_");
            }
        }
        return result;
    }

    public static String addUnderlinesBetweenWords(String extensao, String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(addUnderlinesBetweenWords(words[i]));
            if (i != words.length - 1) {
                sb.append("_");
            }
        }
        sb.append(extensao);
        return sb.toString();
    }

    public static String getExtensionFrom(String fileName) {
        return ".".concat(fileName.split("\\.")[1]);
    }

    public static String getOnlyNumbersFrom(String string) {
        return string.replaceAll("\\D+", "");
    }

    public static String formatToPhone(String string) {
        return getOnlyNumbersFrom(string).replaceFirst("(\\d{2})(\\d{1})(\\d{4})(\\d+)", "($1) $2 $3-$4");
    }

    public static void main(String arg[]){

        System.out.println( getPrimeiroNome("ADAILTON MAGALHAES LIMA"));

    }

}
