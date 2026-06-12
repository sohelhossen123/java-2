//A company is developing an AI-powered Virtual Assistant that can both speak and translate languages.
// 1. Define an interface Speaker with a method speak(String text).
// 2. Define another interface Translator with a method translate(String text, String language).
// 3. Implement a class AIAssistant that inherits both interfaces and provides implementations for speech synthesis and language translation.
// Task: Implement the system and demonstrate how an AI Assistant can both speak and translate text.
// Note: Try to include exception handling code wherever possible.

interface Speaker {
    void speak(String text) throws Exception;
}

interface Translator {
    String translate(String text, String language) throws Exception;
}

class AIAssistant implements Speaker, Translator {
    @Override
    public void speak(String text) throws Exception {
        if (text == null || text.isEmpty()) {
            throw new Exception("Text cannot be null or empty.");
        }
        System.out.println("AI Assistant says: " + text);
    }

    @Override
    public String translate(String text, String language) throws Exception {
        if (text == null || text.isEmpty()) {
            throw new Exception("Text cannot be null or empty.");
        }
        if (language == null || language.isEmpty()) {
            throw new Exception("Language cannot be null or empty.");
        }
        // Simulating translation by appending the language to the text
        return "Translated (" + language + "): " + text;
    }
}

public class ass6 {
    public static void main(String[] args) {
        AIAssistant assistant = new AIAssistant();
        
        try {
            // Demonstrating speaking
            assistant.speak("Hello, how can I assist you today?");
            
            // Demonstrating translation
            String userText = "User says: " + "Konnichiwa, ogenkidesuka ?";
            String translatedText = assistant.translate("Hello, how are you?", "Japanese");
            System.out.println(userText);
            System.out.println(translatedText);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
