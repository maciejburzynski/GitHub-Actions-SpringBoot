package pl.maltoza.HelloMalto.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
@Order(2)
public class FileService {

    public File createFile() throws IOException {
        File file = new File("src/main/resources/test.txt");
        file.createNewFile();
        return file;

    }


}
