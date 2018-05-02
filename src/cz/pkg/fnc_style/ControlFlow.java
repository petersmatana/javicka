package cz.pkg.fnc_style;

import java.util.Optional;

public final class ControlFlow {

    public static <T> Optional<T> tryInvoke(DangerousSupplier<T> supplier) {
        try {
            return Optional.ofNullable(supplier.get());
        } catch (Exception ex) {
            return Optional.empty();
        }
    }

    public interface DangerousSupplier<T> {
        T get() throws Exception;
    }
}
