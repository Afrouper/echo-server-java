package de.afrouper.server;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.Cookie;

import java.io.IOException;

public class JaxRsJsonModule extends Module {

    private final SimpleSerializers simpleSerializers;

    public JaxRsJsonModule() {
        this.simpleSerializers = new SimpleSerializers();
        simpleSerializers.addSerializer(Cookie.class, new CookieSerializer());
    }

    @Override
    public String getModuleName() {
        return "JAX-RS Classes Serializer";
    }

    @Override
    public Version version() {
        return new Version(1, 0, 0, null, null, null);
    }

    @Override
    public void setupModule(SetupContext setupContext) {
        setupContext.addSerializers(simpleSerializers);
    }

    private static class CookieSerializer extends StdSerializer<Cookie> {

        private CookieSerializer() {
            super(Cookie.class);
        }

        @Override
        public void serialize(Cookie cookie, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeStartObject();

            jsonGenerator.writeStringField("name", cookie.getName());
            jsonGenerator.writeStringField("value", cookie.getValue());
            if(cookie.getDomain() != null) {
                jsonGenerator.writeStringField("domain", cookie.getDomain());
            }
            if(cookie.getPath() != null) {
                jsonGenerator.writeStringField("path", cookie.getPath());
            }

            jsonGenerator.writeEndObject();
        }
    }
}
