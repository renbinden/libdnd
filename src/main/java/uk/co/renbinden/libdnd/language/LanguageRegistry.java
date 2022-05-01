package uk.co.renbinden.libdnd.language;

import uk.co.renbinden.libdnd.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static uk.co.renbinden.libdnd.language.phb.PhbLanguage.*;

public final class LanguageRegistry implements Registry<Language> {

    private final Map<String, Language> languages;

    private LanguageRegistry(Map<String, Language> languages) {
        this.languages = languages;
    }

    public static final class Builder {
        private final List<Language> languages;

        public Builder() {
            this.languages = new ArrayList<>();
        }

        public Builder addPhbLanguages() {
            languages.addAll(List.of(
                    COMMON,
                    DWARVISH,
                    ELVISH,
                    GIANT,
                    GNOMISH,
                    GOBLIN,
                    HALFLING,
                    ORC,
                    ABYSSAL,
                    CELESTIAL,
                    DEEP_SPEECH,
                    DRACONIC,
                    INFERNAL,
                    PRIMORDIAL,
                    SYLVAN,
                    UNDERCOMMON
            ));
            return this;
        }

        public Builder addLanguage(Language language) {
            languages.add(language);
            return this;
        }

        public LanguageRegistry build() {
            return new LanguageRegistry(languages.stream().collect(Collectors.toMap(Language::getIdentifier, language -> language)));
        }
    }

    @Override
    public Language getByIdentifier(String identifier) {
        return languages.get(identifier.toLowerCase());
    }

    @Override
    public List<Language> getAllMatching(Predicate<Language> predicate) {
        return languages.values().stream().filter(predicate).toList();
    }

    @Override
    public List<Language> getAll() {
        return languages.values().stream().toList();
    }
}
