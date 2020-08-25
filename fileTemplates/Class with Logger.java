#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${NAME} {
    private static final Logger logger = LoggerFactory.getLogger(${NAME}.class);
}
