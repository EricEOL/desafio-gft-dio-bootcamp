import br.com.ericeol.domain.Bootcamp;
import br.com.ericeol.domain.Curso;
import br.com.ericeol.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList();

        for (int i = 0; i <= 10; i++) {
            String nome = "Curso" + i;
            int cargaHoraria = 10 + i;
            cursos.add(new Curso(nome, cargaHoraria));
        }

        Bootcamp bootcampGFT = new Bootcamp("GFT QA", "Qualidade de Software");
        bootcampGFT.setCursos(cursos);

        Usuario user1 = new Usuario("Eric", "eric@email.com");
        bootcampGFT.setUsuarios(user1);

        System.out.println(bootcampGFT.getUsuarios());
        user1.getcursosAtivos();
        System.out.println(cursos.get(3).getUsuarios());
    }
}
