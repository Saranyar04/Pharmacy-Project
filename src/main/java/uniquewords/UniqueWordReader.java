package uniquewords;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordReader {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(UniqueWordReader.class);

    public void uniqueWords() {
        File file = new File("C:\\Users\\HP\\IdeaProjects\\Pharmacy Project\\src\\main\\resources\\Description.txt");
        Set<String> uniqueWords = new HashSet<>();
        try {
            String content = FileUtils.readFileToString(file, "UTF-8");
            content = content.replaceAll("[,.]", "");
            String[] words = StringUtils.split(content);
            for (int i = 0; i < words.length; i++) {
                uniqueWords.add(words[i]);
            }
            FileUtils.write(file, "\n Unique Words in the file are : " + uniqueWords.toString(), "UTF-8", true);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}

