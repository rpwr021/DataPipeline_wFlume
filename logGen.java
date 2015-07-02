import org.apache.log4j.Logger;

public class logGen{

        final static Logger logger = Logger.getLogger(logGen.class);

        public static void main(String[] args) {

                logGen obj = new logGen();
        int num = Integer.parseInt(args[0]) ;
        for(int i=0;i<num;i++) {
                obj.runMe("Log4J Dummy Event In Test");
        }
}

        private void runMe(String parameter){

                if(logger.isDebugEnabled()){
                        logger.debug("This is debug : " + parameter);
                }

                if(logger.isInfoEnabled()){
                        logger.info("This is info : " + parameter);
                }

                 logger.warn("This is warn  : " + parameter);
                logger.error("This is error : " + parameter);
                logger.fatal("This is fatal : " + parameter);

        }

}
