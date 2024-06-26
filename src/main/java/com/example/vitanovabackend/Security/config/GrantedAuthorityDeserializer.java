package com.example.vitanovabackend.Security.config;
import com.example.vitanovabackend.DAO.Entities.ERole;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.IOException;

public class GrantedAuthorityDeserializer extends StdDeserializer<GrantedAuthority> {

    public GrantedAuthorityDeserializer() {
        this(null);
    }

    public GrantedAuthorityDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public GrantedAuthority deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String authority = node.asText();
        return new SimpleGrantedAuthority(authority);
    }

}
