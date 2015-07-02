import org.apache.log4j.Logger;

//simple class to generate dummy log events using log4j framework 

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
                        logger.debug("Message level - debug : " + parameter);
                }

                if(logger.isInfoEnabled()){
                        logger.info("Message level - info : " + parameter);
                }

                 logger.warn("Message level - warn  : " + parameter);
                logger.error("Message level - error : " + parameter);
                logger.fatal("Message level - fatal : " + parameter);
 
        }

}
