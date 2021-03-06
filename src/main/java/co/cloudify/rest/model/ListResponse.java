package co.cloudify.rest.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Encapsulates a list-style response from Cloudify Manager. This class
 * implements {@link Iterable}, to make it easier for callers to obtain all list
 * elements.
 * 
 * @author Isaac Shabtay
 *
 * @param <T> type of contained items
 */
@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListResponse<T> implements Iterable<T>, Serializable {
    /** Serialization UID. */
    private static final long serialVersionUID = 1L;

    @XmlElement
    private List<T> items;

    @XmlElement
    private Metadata metadata;

    /**
     * @return A {@link List} of all items.
     */
    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    /**
     * @return The {@link Metadata} information.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    public Stream<T> stream() {
        return items.stream();
    }

    @Override
    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("metadata", metadata)
                .append("items", items)
                .toString();
    }
}
