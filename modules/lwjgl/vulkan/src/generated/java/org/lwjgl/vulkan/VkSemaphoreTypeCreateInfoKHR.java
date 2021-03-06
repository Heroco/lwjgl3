/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the type of a newly created semaphore.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRTimelineSemaphore#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR}</li>
 * <li>{@code semaphoreType} <b>must</b> be a valid {@code VkSemaphoreTypeKHR} value</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-timelineSemaphore">{@code timelineSemaphore}</a> feature is not enabled, {@code semaphoreType} <b>must</b> not equal {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}</li>
 * <li>If {@code semaphoreType} is {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR}, {@code initialValue} <b>must</b> be zero.</li>
 * </ul>
 * 
 * <p>If no {@link VkSemaphoreTypeCreateInfoKHR} structure is included in the {@code pNext} chain of {@link VkSemaphoreCreateInfo}, then the created semaphore will have a default {@code VkSemaphoreTypeKHR} of {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR}.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code semaphoreType} &ndash; a {@code VkSemaphoreTypeKHR} value specifying the type of the semaphore.</li>
 * <li>{@code initialValue} &ndash; the initial payload value if {@code semaphoreType} is {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_TIMELINE_KHR SEMAPHORE_TYPE_TIMELINE_KHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreTypeCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreTypeKHR semaphoreType;
 *     uint64_t initialValue;
 * }</code></pre>
 */
public class VkSemaphoreTypeCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORETYPE,
        INITIALVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORETYPE = layout.offsetof(2);
        INITIALVALUE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSemaphoreTypeCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreTypeCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code semaphoreType} field. */
    @NativeType("VkSemaphoreTypeKHR")
    public int semaphoreType() { return nsemaphoreType(address()); }
    /** Returns the value of the {@code initialValue} field. */
    @NativeType("uint64_t")
    public long initialValue() { return ninitialValue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreTypeCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreTypeCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreType} field. */
    public VkSemaphoreTypeCreateInfoKHR semaphoreType(@NativeType("VkSemaphoreTypeKHR") int value) { nsemaphoreType(address(), value); return this; }
    /** Sets the specified value to the {@code initialValue} field. */
    public VkSemaphoreTypeCreateInfoKHR initialValue(@NativeType("uint64_t") long value) { ninitialValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreTypeCreateInfoKHR set(
        int sType,
        long pNext,
        int semaphoreType,
        long initialValue
    ) {
        sType(sType);
        pNext(pNext);
        semaphoreType(semaphoreType);
        initialValue(initialValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreTypeCreateInfoKHR set(VkSemaphoreTypeCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfoKHR malloc() {
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfoKHR calloc() {
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreTypeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreTypeCreateInfoKHR create(long address) {
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreTypeCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreTypeCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreTypeCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSemaphoreTypeCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSemaphoreTypeCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkSemaphoreTypeCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreTypeCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreTypeCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphoreType}. */
    public static int nsemaphoreType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreTypeCreateInfoKHR.SEMAPHORETYPE); }
    /** Unsafe version of {@link #initialValue}. */
    public static long ninitialValue(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreTypeCreateInfoKHR.INITIALVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreTypeCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreTypeCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphoreType(int) semaphoreType}. */
    public static void nsemaphoreType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreTypeCreateInfoKHR.SEMAPHORETYPE, value); }
    /** Unsafe version of {@link #initialValue(long) initialValue}. */
    public static void ninitialValue(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreTypeCreateInfoKHR.INITIALVALUE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreTypeCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreTypeCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkSemaphoreTypeCreateInfoKHR ELEMENT_FACTORY = VkSemaphoreTypeCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreTypeCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreTypeCreateInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkSemaphoreTypeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreTypeCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreTypeCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code semaphoreType} field. */
        @NativeType("VkSemaphoreTypeKHR")
        public int semaphoreType() { return VkSemaphoreTypeCreateInfoKHR.nsemaphoreType(address()); }
        /** Returns the value of the {@code initialValue} field. */
        @NativeType("uint64_t")
        public long initialValue() { return VkSemaphoreTypeCreateInfoKHR.ninitialValue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreTypeCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreTypeCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreTypeCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreTypeCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreType} field. */
        public VkSemaphoreTypeCreateInfoKHR.Buffer semaphoreType(@NativeType("VkSemaphoreTypeKHR") int value) { VkSemaphoreTypeCreateInfoKHR.nsemaphoreType(address(), value); return this; }
        /** Sets the specified value to the {@code initialValue} field. */
        public VkSemaphoreTypeCreateInfoKHR.Buffer initialValue(@NativeType("uint64_t") long value) { VkSemaphoreTypeCreateInfoKHR.ninitialValue(address(), value); return this; }

    }

}