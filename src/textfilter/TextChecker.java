package textfilter;

public class TextChecker {
    public static void main(String[] args) {
        String text = "Hello, it's my dull simple text :";
        var textAnalyzers = new TextAnalyzer[] {
                new SpamAnalyzer(new String[]{"dull"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(1000)
        };
        System.out.println(new TextChecker().checkLabels(textAnalyzers, text));
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
