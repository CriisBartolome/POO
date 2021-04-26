
public enum TipoArchivos {

    VIDEO {
        @Override
        public Archivo crear() {
            return new ArchivoVideo();
        }
    }, AUDIO {
        @Override
        public Archivo crear() {
            return new ArchivoAudio();
        }
    };
    
    public abstract Archivo crear();
}
