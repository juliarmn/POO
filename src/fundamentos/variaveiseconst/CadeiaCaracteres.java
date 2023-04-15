package fundamentos.variaveiseconst;

public  class CadeiaCaracteres {
    public static void main(String[] args) {
        System.out.println("Bom dia!".charAt(3));
        //String é imutável
        String str = "Olá";
        //Concatenar:
        //1)
        System.out.println(str.concat(", tudo bem?"));
        str = "Oii";
        System.out.println(str + ", tudo bem?");

        //Qual letra inicia:
        System.out.println(str.startsWith("D"));
        //Case sensitive
        System.out.println(str.toLowerCase().startsWith("O"));

        //Qual termina:
        System.out.println(str.endsWith("bem?"));

        //Tamanho:
        System.out.println(str.length());

        //Comparação:
        //Só equals = case sensitive
        System.out.println(str.equalsIgnoreCase("oii, tudo bem?"));

        //Apresentação: string.format¹

        //Verificar substring:
        System.out.println(str.contains("Oii"));

        System.out.println(str.substring(4, 7));

    }
}
