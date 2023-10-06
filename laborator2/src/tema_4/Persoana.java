package tema_4; // Aceasta specifică că această clasă se află în pachetul "tema_4".

import java.time.LocalDate; // Importăm clasa LocalDate pentru a facilita lucrul cu datele.
import java.time.Period; // Importăm clasa Period pentru a calcula perioadele dintre date.

public class Persoana { // Definim clasa Persoana.

    private String nume; // Variabilă membră privată pentru nume.
    private String cnp; // Variabilă membră privată pentru CNP.

    public Persoana(String nume, String cnp) { // Constructorul clasei Persoana.
        this.nume = nume; // Inițializăm numele cu valoarea primită în constructor.
        this.cnp = cnp; // Inițializăm cnp-ul cu valoarea primită în constructor.
    }

    public String getNume() { // Metodă pentru a obține numele.
        return nume; // Returnăm valoarea numelui.
    }

    public void setNume(String nume) { // Metodă pentru a seta numele.
        this.nume = nume; // Actualizăm valoarea numelui.
    }

    public String getCnp() { // Metodă pentru a obține CNP-ul.
        return cnp; // Returnăm valoarea CNP-ului.
    }

    public void setCnp(String cnp) { // Metodă pentru a seta CNP-ul.
        this.cnp = cnp; // Actualizăm valoarea CNP-ului.
    }

    public int getVarsta() { // Metodă pentru a calcula vârsta.
        LocalDate dataNasterii = LocalDate.of( // Obținem data nașterii din CNP.
                Integer.parseInt(cnp.substring(1, 3)) + 2000,
                Integer.parseInt(cnp.substring(3, 5)),
                Integer.parseInt(cnp.substring(5, 7))
        );

        LocalDate dataCurenta = LocalDate.now(); // Obținem data curentă.

        Period perioada = Period.between(dataNasterii, dataCurenta); // Calculăm perioada dintre cele două date.

        return perioada.getYears(); // Returnăm vârsta în ani.
    }

    @Override
    public String toString() { // Suprascriem metoda toString pentru a obține o reprezentare sub formă de șir de caractere a obiectului.
        return nume + ", " + cnp + ", " + getVarsta(); // Returnăm numele, CNP-ul și vârsta ca un șir de caractere.
    }
}
