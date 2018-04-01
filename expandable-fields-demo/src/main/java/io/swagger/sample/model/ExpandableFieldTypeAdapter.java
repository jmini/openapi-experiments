package io.swagger.sample.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ExpandableFieldTypeAdapter extends XmlAdapter<Object, ExpandableField<?>> {

    @Override
    public ExpandableField<?> unmarshal(Object v) throws Exception {
        if (v instanceof String) {
            @SuppressWarnings({ "unchecked", "rawtypes" })
            ExpandableField<?> idField = new ExpandableField((String) v, null);
            return idField;
        }
        else if (v instanceof Actor) {
            return new ExpandableField<Actor>(((Actor) v).getId(), (Actor) v);
        }
        else if (v instanceof Film) {
            return new ExpandableField<Film>(((Film) v).getId(), (Film) v);
        }
        else if (v instanceof Category) {
            return new ExpandableField<Category>(((Category) v).getId(), (Category) v);
        }
        return null;
    }

    @Override
    public Object marshal(ExpandableField<?> v) throws Exception {
        if (v.getExpanded() != null) {
            return v.getExpanded();
        }
        else {
            return v.getId();
        }
    }

}