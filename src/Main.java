
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String NIM = "202310370311371";
        String username = "Admin";
        String password = "Admin";

        while (true) {
            System.out.println("=== Menu Login ===:");
            System.out.println("1. Masuk sebagai Mahasiswa");
            System.out.println("2. Masuk sebagai Admin");
            System.out.println("3. Keluar");

            System.out.print("Pilih opsi (1-3): ");
            try {
                int opsi = scanner.nextInt();
                String inputNIM, inputUsername, inputPassword;

                switch (opsi) {
                    case 1:
                        System.out.println("Masuk sebagai Mahasiswa:");
                        inputNIM = scanner.next();
                        if (inputNIM.equals(NIM)) {
                            System.out.println("Login Mahasiswa Berhasil.");
                        } else {
                            System.out.println("Mahasiswa Tidak Ditemukan.");
                        }
                        break;

                    case 2:
                        System.out.println("Masuk sebagai Admin:");
                        System.out.print("Masukkan username: ");
                        inputUsername = scanner.next();
                        System.out.print("Masukkan password: ");
                        inputPassword = scanner.next();

                        if (inputUsername.equals(username) && inputPassword.equals(password)) {
                            System.out.println("Login Admin Berhasil.");
                        } else {
                            System.out.println("Admin Tidak Ditemukan.");
                        }
                        break;

                    case 3:
                        System.out.println("Keluar.");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Pilihan Tidak Valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan harus berupa bilangan bulat.");
                scanner.next();
            }\
        }
    }
}