package temp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();

        Pet aPet = new Pet();
        aPet.setId(1l);
        aPet.setName("Bill");
        aPet.setAge(9);
        aPet.setType(Animal.MAMMOTH);

        pets.add(aPet);

        Pet twoPet = new Pet();
        twoPet.setId(1l);
        twoPet.setName("Bill");
        twoPet.setAge(9);
        twoPet.setType(Animal.MAMMOTH);

        pets.add(twoPet);

        return pets;
    }

    public Login login() {
        Login login = new Login();
        login.setEcho("GUANG JUN SO HANDSOME");
        return login;
    }
}