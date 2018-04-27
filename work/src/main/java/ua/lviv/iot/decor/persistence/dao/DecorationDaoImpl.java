package ua.lviv.iot.decor.persistence.dao;

import ua.lviv.iot.decor.decorations.Decoration;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class DecorationDaoImpl extends AbstractDao<Decoration> implements DecorationDao, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Decoration> getEntityClass() {
        return Decoration.class;
    }

}
