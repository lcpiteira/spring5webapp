package guru.springframework.spring5webapp.boostrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootStrapPublisherData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        Publisher lx = new Publisher("Avenida Columbano Bordalo Pinherio", "Lisbon", "Lisbon","1070-061");
        publisherRepository.save(lx);

        Publisher opo = new Publisher("Estadio do Dragao", "Oporto", "Oporto", "1111-111");
        publisherRepository.save(opo);
        publisherRepository.delete(opo);

        System.out.println("Started in BootStrap");
        System.out.println("Number of Addresses: "+ publisherRepository.count());

    }
}
