import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
public class UtilClass {
        private Flori flori;
        public UtilClass() {

        }
        public void adaugaFisier( Flori flori) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("util.json"), flori );
        }
        public void citesteFisier(Flori flori) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readValue(Paths.get("util.json").toFile() , Flori.class);
        }
    }
