public class Main {

    public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {
            case 'A':
                //case : durumları değerlendirir
                System.out.println("Mükemmel = Geçtiniz");
                //break: switch bitirmek için kullanılır

                break;
            case 'B':
                System.out.println("Harika = Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("Fena değil = Geçtiniz");
                break;
                //beraber kullanıldığında her iki durum içinde ayı sonucu verir;
            case 'F':
                System.out.println("Maalesef = Kaldınız");
                break;
            //default: kullanıcı istenilen dışında bir şey girdiğinde ne olacağını gösterir,
            default:
                System.out.println("Geçersiz Not Girdiniz");
//Cntrl+shift++altL ile codların satır başları düzenlenir izalanır
        }
    }
}
